package comparators;

import model.Car;

import java.util.Comparator;

public class CarVendorComparator implements Comparator<Car> {

    @Override
    public int compare(Car car1, Car car2) {
        return car1.getVendor().compareTo(car2.getVendor());
    }
}
