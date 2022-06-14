package labs.Lab6.Car;

import java.util.Comparator;

public class CarFuelComparator implements Comparator<Car> {
    @Override
    public int compare(Car car1, Car car2) {
        return Float.compare(car1.getFuelCosts(), car2.getFuelCosts());
    }
}
