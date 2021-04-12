package figure.app;

import figure.data.Circle;
import figure.data.Square;
import figure.data.Triangle;

public class FigureApp {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(10, 15.5, 20.30, 15);
        System.out.println("Triangle " + triangle.printInfo());
        triangle.calcPerimeter();
        triangle.calcSquare();
        System.out.println();

        Circle circle = new Circle(10);
        System.out.println("Circle " + circle.printInfo());
        circle.calcSquare();
        System.out.println();
        circle.calcPerimeter();
        System.out.println("\n");

        Square square = new Square(25);
        System.out.println("Square " + square.printInfo());
        square.calcSquare();
        square.calcPerimeter();
        System.out.println();

    }

}
