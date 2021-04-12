package figure.data;

public class Square extends Figure {
    public Square() {
    }

    public Square(double length) {
        super(length);
    }

    @Override
    public void calcSquare() {
        System.out.println("Square Square= " + (getLength() * getLength()));

    }

    @Override
    public void calcPerimeter() {
        System.out.println("Square Perimeter= " + (getLength() * 4));
    }
}
