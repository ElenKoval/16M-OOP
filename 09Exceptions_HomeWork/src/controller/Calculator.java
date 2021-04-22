package controller;

import exceptions.MyArithmeticException;

public class Calculator {
    int a = 0;
    int b = 0;

    public static void main(String[] args) {
        try {
            division(4, 0);

        } catch (ArithmeticException e) {
            System.out.println("Division by 0 is prohibited");
        }

        try {
            mult(3, 10);//нельзя умножать на 10

        } catch (MyArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void mult(int num1, int num2) throws MyArithmeticException {
        if (num1 == 10 || num2 == 10) {
            throw new MyArithmeticException();
        }
        int res = num1 * num2;
        System.out.println(res);
    }

    private static void division(int num1, int num2) {
        int res = num1 / num2;
        System.out.println(res);
    }
}

