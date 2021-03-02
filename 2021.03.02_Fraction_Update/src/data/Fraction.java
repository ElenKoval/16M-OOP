package data;

public class Fraction {
    private int numerator;
    private int denominator;
    private int wholeNumber;

    public Fraction(int wholeNumber, int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        this.wholeNumber = wholeNumber;
    }

    public Fraction(int nominator, int denominator) {
        this.numerator = nominator;
        this.denominator = denominator;
    }


    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    @Override
    public String toString() {
        return
                (wholeNumber > 0 ? "Получаем смешанное число: Целая часть дроби: " + wholeNumber + " " : "")
                        +
                        "numerator = " + numerator +
                        ", denominator = " + denominator;
    }
}


