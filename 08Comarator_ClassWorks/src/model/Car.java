package model;

import java.util.Objects;

public class Car implements Comparable<Car> {
    private String vendor;
    private int year;
    private double engine;

    public Car(String vendor, int year, double engine) {
        this.engine = engine;
        this.year = year;
        this.vendor = vendor;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Car)) return false;
        Car car = (Car) object;
        return year == car.year &&
                Double.compare(car.engine, engine) == 0 &&
                Objects.equals(vendor, car.vendor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vendor, year, engine);
    }

    @Override
    public String toString() {
        return "Car{" +
                "vendor='" + vendor + '\'' +
                ", year=" + year +
                ", engine=" + engine +
                '}' + "\n";
    }

    @Override
    public int compareTo(Car car1) {
        if (this.engine > car1.engine) {
            return 1;
        }
        if (this.engine < car1.engine) {
            return -1;
        }
        return compareByYear(car1);
    }

    private int compareByYear(Car car1) {
        if (this.year > car1.year) {
            return -1;
        }
        if (this.year < car1.year) {
            return 1;
        }
        return 0;
    }
}