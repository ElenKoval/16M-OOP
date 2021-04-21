package controller;

import comparators.CarVendorAndEngineComparator;
import comparators.CarVendorComparator;
import comparators.CarYearComparator;
import comparators.StringLengthComparator;
import model.Car;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorApp {
    public static void main(String[] args) {
        String[] strArr = {"x", "xy", "xyz", "a", "ab", "abc"};
        System.out.println(Arrays.toString(strArr));
        Arrays.sort(strArr);
        System.out.println(Arrays.toString(strArr));
        Comparator<String> comparatorByLength = new StringLengthComparator();
        Arrays.sort(strArr, comparatorByLength);
        System.out.println(Arrays.toString(strArr));

        Car[] cars = new Car[5];
        cars[0] = new Car("GMC", 2017, 2.8);
        cars[1] = new Car("GMC", 2017, 4.5);
        cars[2] = new Car("Toyota", 2019, 1.5);
        cars[3] = new Car("VW", 2018, 1.5);
        cars[4] = new Car("Renault", 2013, 1.8);
        System.out.println(Arrays.toString(cars));
        System.out.println(cars[0].equals(cars[0]));
        System.out.println(cars[0].equals(cars[1]));
        Arrays.sort(cars);
        System.out.println(Arrays.toString(cars));
        Comparator<Car> comparatorByYear = new CarYearComparator();
        Arrays.sort(cars, comparatorByYear);
        System.out.println(Arrays.toString(cars));
        System.out.println("========HomeWork===========");

        Arrays.sort(cars, new CarVendorComparator());
        System.out.println(Arrays.toString(cars));
        System.out.println("========HomeWork===========");

//сортировка: при одинаковом Vendor сортируем по engine по убывающей
        Arrays.sort(cars, new CarVendorAndEngineComparator());
        System.out.println(Arrays.toString(cars));


    }
}