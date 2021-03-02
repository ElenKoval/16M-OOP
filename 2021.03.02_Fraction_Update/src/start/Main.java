package start;


import calculator.Math;
import data.Fraction;


public class Main {
    public static void main(String[] args) {
        Fraction fr1 = new Fraction(3, 10);
        Fraction fr2 = new Fraction(2, 10);

        Fraction fr3 = new Fraction(23, 5);
        Fraction fr4 = new Fraction(4, 5);


        Fraction resultAddition = Math.addition(fr1, fr2);
        Fraction resultAdditionMixed = Math.addition(fr3, fr4);

        Fraction resultSubstraction = Math.substraction(fr1, fr2);
        Fraction resultSubstractionMixed = Math.substraction(fr3, fr4);

        Fraction resultMuliplication = Math.multiplication(fr1, fr2);
        Fraction resultMuliplicationMixed = Math.multiplication(fr3, fr4);

        Fraction resultDivision = Math.division(fr1, fr2);
        Fraction resultDivisonMixed = Math.division(fr3, fr4);

        System.out.println("Наш результат сложения: " + resultAddition);
        System.out.println("________________");

        System.out.println("Наш результат сложения: " + resultAdditionMixed);
        System.out.println("________________");

        System.out.println("Наш результат вычитания: " + resultSubstraction);
        System.out.println("________________");

        System.out.println("Наш результат вычитания: " + resultSubstractionMixed);
        System.out.println("________________");

        System.out.println("Наш результат умножения: " + resultMuliplication);
        System.out.println("________________");

        System.out.println("Наш результат умножения: " + resultMuliplicationMixed);
        System.out.println("________________");

        System.out.println("Наш результат деления: " + resultDivision);
        System.out.println("________________");

        System.out.println("Наш результат деления: " + resultDivisonMixed);
        System.out.println("________________");


    }
}
