package calculator;

import data.Fraction;

public class Math {


    public static Fraction addition(Fraction a, Fraction b) {
        int wholeNumber = 0;
        int cDenominator = leastCommonMultiple(a.getDenominator(), b.getDenominator());
        int cNumerator = a.getNumerator() * cDenominator / a.getDenominator()
                + b.getNumerator() * cDenominator / b.getDenominator();

        int cDenominatorNew = cDenominator / gcdRecursionAlgorithm(cNumerator, cDenominator);
        int cNumeratorNew = cNumerator / gcdRecursionAlgorithm(cNumerator, cDenominator);

        if (cNumeratorNew > cDenominatorNew && cNumeratorNew % cDenominatorNew != 0) {
            wholeNumber = cNumeratorNew / cDenominatorNew;
            cNumeratorNew = cNumeratorNew % cDenominatorNew;
        }

        Fraction c = new Fraction(wholeNumber, cNumeratorNew, cDenominatorNew);
        return c;
    }


    public static Fraction substraction(Fraction a, Fraction b) {
        int wholeNumber = 0;
        int cDenominator = leastCommonMultiple(a.getDenominator(), b.getDenominator());
        int cNumerator = a.getNumerator() * cDenominator / a.getDenominator()
                - b.getNumerator() * cDenominator / b.getDenominator();

        int cDenominatorNew = cDenominator / gcdRecursionAlgorithm(cNumerator, cDenominator);
        int cNumeratorNew = cNumerator / gcdRecursionAlgorithm(cNumerator, cDenominator);

        if (cNumeratorNew > cDenominatorNew && cNumeratorNew % cDenominatorNew != 0) {
            wholeNumber = cNumeratorNew / cDenominatorNew;
            cNumeratorNew = cNumeratorNew % cDenominatorNew;
        }

        Fraction c = new Fraction(wholeNumber, cNumeratorNew, cDenominatorNew);
        return c;
    }

    public static Fraction multiplication(Fraction a, Fraction b) {
        int wholeNumber = 0;
        int cNumerator = a.getNumerator() * b.getNumerator();
        int cDenominator = a.getDenominator() * b.getDenominator();

        int cDenominatorNew = cDenominator / gcdRecursionAlgorithm(cNumerator, cDenominator);
        int cNumeratorNew = cNumerator / gcdRecursionAlgorithm(cNumerator, cDenominator);

        if (cNumeratorNew > cDenominatorNew && cNumeratorNew % cDenominatorNew != 0) {
            wholeNumber = cNumeratorNew / cDenominatorNew;
            cNumeratorNew = cNumeratorNew % cDenominatorNew;
        }

        Fraction c = new Fraction(wholeNumber, cNumeratorNew, cDenominatorNew);
        return c;
    }

    public static Fraction division(Fraction a, Fraction b) {
        int wholeNumber = 0;
        int cNumerator = a.getNumerator() * b.getDenominator();
        int cDenominator = a.getDenominator() * b.getNumerator();

        int cDenominatorNew = cDenominator / gcdRecursionAlgorithm(cNumerator, cDenominator);
        int cNumeratorNew = cNumerator / gcdRecursionAlgorithm(cNumerator, cDenominator);

        if (cNumeratorNew > cDenominatorNew && cNumeratorNew % cDenominatorNew != 0) {
            wholeNumber = cNumeratorNew / cDenominatorNew;
            cNumeratorNew = cNumeratorNew % cDenominatorNew;
        }

        Fraction c = new Fraction(wholeNumber, cNumeratorNew, cDenominatorNew);
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

}