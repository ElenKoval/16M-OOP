package exceptions;

public class MyArithmeticException extends Exception {
    int number;

    public MyArithmeticException() {
        super("You tried to multiply by 10-is prohibited");
    }
}

