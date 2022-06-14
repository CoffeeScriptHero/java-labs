package labs.Lab6;

import labs.Lab6.Car.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        final int C13 = 1309 % 13;
        // Визначити ієрархію легкових автомобілів. Створити таксопарк. Порахувати вартість автопарку.
        // Провести сортування автомобілів парку за витратами палива.
        // Знайти автомобіль у компанії, що відповідає заданому діапазону швидкості автомобіля.

        Car car1 = new Nissan(11930.5F, 4.1F, 190F);
        Car car2 = new Toyota(21000F, 7.1F, 230F);
        Car car3 = new Suzuki(9032.43F, 7.9F, 205F);
        Car car4 = new BMW(29540.2F, 9.4F, 280F);
        ArrayList<Car> cars = new ArrayList<>(List.of(car1, car3, car4, car2));
        CarPark carPark = new CarPark(cars);
        carPark.printCars();
        System.out.printf("Ціна всього автопарку: %s$\n", carPark.countParkPrice());
        carPark.sortByFuelCosts();
        carPark.printCars();
        carPark.findCarBySpeed(170, 290);
    }
}
