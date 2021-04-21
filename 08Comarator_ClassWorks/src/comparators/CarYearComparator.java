package comparators;

import model.Car;

import java.util.Comparator;

public class CarYearComparator implements Comparator<Car> {
    @Override
    public int compare(Car car1, Car car2) {
//        Integer.compare(car1.getYear(),car2.getYear());
        return car2.getYear() - car1.getYear();
    }
}