package comparators;

import model.Car;

import java.util.Comparator;

public class CarVendorAndEngineComparator implements Comparator<Car> {
    @Override
    public int compare(Car car1, Car car2) {
        int res = car1.getVendor().compareTo(car2.getVendor());
        return res == 0 ? Double.compare(car2.getEngine(), car1.getEngine()) : res;
    }
}
