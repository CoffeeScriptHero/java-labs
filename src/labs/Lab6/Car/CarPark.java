package labs.Lab6.Car;

import java.util.ArrayList;

public class CarPark {
    private ArrayList<Car> carPark;

    public CarPark(ArrayList<Car> carPark) {
        this.carPark = carPark;
    }

    public ArrayList<Car> getCarPark() {
        return carPark;
    }

    public void setCarPark(ArrayList<Car> carPark) {
        this.carPark = carPark;
    }

    public float countParkPrice() {
        float price = 0;
        for (Car car : carPark) {
            price += car.getPrice();
        }
        return price;
    }

    public void sortByFuelCosts() {
        CarFuelComparator fuelComparator = new CarFuelComparator();
        carPark.sort(fuelComparator);
    }

    public void printCars() {
        System.out.println("------------------------------------------");
        carPark.forEach(Car::displayInfo);
        System.out.println("------------------------------------------");
    }

    public void findCarBySpeed(float min, float max) {
        Car car = carPark.stream().filter(c -> c.getSpeed() >= min && c.getSpeed() <= max).findAny().orElse(null);
        if (car != null) {
            System.out.println("Машина зі швидкістю в діапазоні від %.2fкм до %.2fкм:");
            car.displayInfo();
        } else {
            System.out.printf("Машина зі швидкістю в діапазоні від %.2fкм до %.2fкм не була знайдена", min, max);
        }
    }

    @Override
    public String toString() {
        return String.format("CarPark{carPark='%s'}", carPark);
    }
}
