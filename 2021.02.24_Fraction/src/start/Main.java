package start;


import data.Fraction;
import calculator.Math;


public class Main {
    public static void main(String[] args) {
        Fraction myFirstLovelyFraction = new Fraction(7, 5);
        Fraction fr2 = new Fraction(2, 5);


        Fraction result = Math.addition(myFirstLovelyFraction, fr2);
        int wholeNumberAdd = Math.wholeNumbers(Math.addition(myFirstLovelyFraction, fr2).getNumerator(),
                Math.addition(myFirstLovelyFraction, fr2).getDenominator());


        Fraction result1 = Math.substraction(myFirstLovelyFraction, fr2);
        int wholeNumberSub = Math.wholeNumbers(Math.substraction(myFirstLovelyFraction, fr2).getNumerator(),
                Math.substraction(myFirstLovelyFraction, fr2).getDenominator());


        Fraction result2 = Math.multiplication(myFirstLovelyFraction, fr2);
        int wholeNumberMulti = Math.wholeNumbers(Math.multiplication(myFirstLovelyFraction, fr2).getNumerator(),
                Math.multiplication(myFirstLovelyFraction, fr2).getDenominator());

        Fraction result3 = Math.division(myFirstLovelyFraction, fr2);
        int wholeNumberDiv = Math.wholeNumbers(Math.division(myFirstLovelyFraction, fr2).getNumerator(),
                Math.division(myFirstLovelyFraction, fr2).getDenominator());


        System.out.println("Наш результат: " + result);
        System.out.print(wholeNumberAdd > 0 ? "Дробь неправильная, переводим в смешанное число: Целая часть дроби: " + wholeNumberAdd + " " : "");
        System.out.println((result.getNumerator() > result.getDenominator() ? Math.newNumenator(result) : ""));
        System.out.println("________________");

        System.out.println("Наш результат: " + result1);
        System.out.print(wholeNumberSub > 0 ? "Дробь неправильная, переводим в смешанное число: Целая часть дроби: " + wholeNumberSub + " " : "");
        System.out.println((result1.getNumerator() > result1.getDenominator() ? Math.newNumenator(result1) : ""));
        System.out.println("________________");

        System.out.println("Наш результат: " + result2);
        System.out.print(wholeNumberMulti > 0 ? "Дробь неправильная, переводим в смешанное число: Целая часть дроби: " + wholeNumberMulti + " " : "");
        System.out.println((result2.getNumerator() > result2.getDenominator() ? Math.newNumenator(result2) : "rsult2"));
        System.out.println("________________");

        System.out.println("Наш результат: " + result3);
        System.out.print(wholeNumberDiv > 0 ? "Дробь неправильная, переводим в смешанное число: Целая часть дроби: " + wholeNumberDiv + " " : "");
        System.out.println((result3.getNumerator() > result3.getDenominator() ? Math.newNumenator(result3) : ""));
        System.out.println("________________");


    }
}
