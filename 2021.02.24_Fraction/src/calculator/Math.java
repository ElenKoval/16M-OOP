package calculator;

import data.Fraction;

public class Math {
    public static Fraction newNumenator(Fraction input) {
        if (input.getNumerator() < input.getDenominator()) {
            return input;
        } else {
            input.setNumerator(input.getNumerator() % input.getDenominator());

        }
        return input;

    }

    public static Fraction addition(Fraction a, Fraction b) {
        int cNumerator;
        int cDenominator;
        cDenominator = leastCommonMultiple(a.getDenominator(), b.getDenominator());
        cNumerator = a.getNumerator() * cDenominator / a.getDenominator()
                + b.getNumerator() * cDenominator / b.getDenominator();
        Fraction c = new Fraction(cNumerator, cDenominator);
        return c;
    }


    public static Fraction substraction(Fraction a, Fraction b) {
        int cNumerator;
        int cDenominator;
        cDenominator = leastCommonMultiple(a.getDenominator(), b.getDenominator());
        cNumerator = a.getNumerator() * cDenominator / a.getDenominator()
                - b.getNumerator() * cDenominator / b.getDenominator();
        Fraction c = new Fraction(cNumerator, cDenominator);
        return c;
    }

    public static Fraction multiplication(Fraction a, Fraction b) {
        int cNumerator = 0;
        int cDenominator = 0;
        cNumerator = a.getNumerator() * b.getNumerator();
        cDenominator = a.getDenominator() * b.getNumerator();
        Fraction c = new Fraction(cNumerator, cDenominator);
        return c;
    }

    public static Fraction division(Fraction a, Fraction b) {
        int cNumerator = 0;
        int cDenominator = 0;
        cNumerator = a.getNumerator() * b.getDenominator();
        cDenominator = a.getDenominator() * b.getNumerator();
        Fraction c = new Fraction(cNumerator, cDenominator);
        return c;
    }


    public static int gcdRecursionAlgorithm(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcdRecursionAlgorithm(b, a % b);
    }

    public static int leastCommonMultiple(int a, int b) {
        return a / gcdRecursionAlgorithm(a, b) * b;
    }


    public static int wholeNumbers(int numeratorA, int denominatorB) {
        return numeratorA / denominatorB;
    }
}