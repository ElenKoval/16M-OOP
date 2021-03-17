package comparator;

import car.Car;

import java.util.Comparator;

public class ComparatorByEngine implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return (int) (o1.getEngine() - o2.getEngine());
    }
}
