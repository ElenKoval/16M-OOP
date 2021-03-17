package car;

import comparator.*;

import java.util.Arrays;

public class CarAppl {
    public static void main(String[] args) {
        Car[] cars = {
                new Car(2018, "Peugeot 208", "Green", 4.8, 8800),
                new Car(2020, "Skoda Fabia", "Black", 4.5, 14900),
                new Car(2018, "Ford Mondeo", "Grey", 5.1, 20790),
                new Car(2017, "Citroen C5", "White", 4.4, 17240),
                new Car(2014, "Mercedes-Benz", "Rot", 5.1, 18950),
                new Car(2013, "Jaguar XF", "Black", 5.1, 14900),
                new Car(2020, "Fiat Ducato", "White", 7.1, 28917),
                new Car(2002, "Subaru Forester", "Green", 9.7, 1100),
                new Car(2017, "Ford Mustang", "Blue", 8.2, 33000)
        };
        System.out.println("Arrays before sorting: ");
        displayCars(cars);
        Arrays.sort(cars);
        System.out.println("Arrays after sorting, compare by field model;");
        displayCars(cars);

        System.out.println("Arrays after sorting, using the Comparator by Color");
        Arrays.sort(cars, new ComparatorByColor());
        displayCars(cars);

        System.out.println("Arrays after sorting, using the Comparator by Price");
        Arrays.sort(cars, new ComparatorByPrice());
        displayCars(cars);


        System.out.println("Arrays after sorting, using the Comparator by Engine");
        Arrays.sort(cars, new ComparatorByEngine());
        displayCars(cars);

        System.out.println("Arrays after sorting, using the Comparator by Year");
        Arrays.sort(cars, new ComparatorByYear());
        displayCars(cars);

        System.out.println("Arrays after sorting, using the Comparator by Year and Price");
        Arrays.sort(cars, new ComparatorByYearAndPrice());
        displayCars(cars);

    }


    private static void displayCars(Car[] cars) {
        for (Car c : cars) {
            System.out.println(c);
        }
    }
}


