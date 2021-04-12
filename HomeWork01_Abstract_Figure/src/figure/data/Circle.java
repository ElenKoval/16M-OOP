package figure.data;

public class Circle extends Figure {
    public Circle() {
    }

    public Circle(double length) {
        super(length);
    }

    @Override
    public void calcSquare() {
        System.out.format("Circle Square " + "%.2f", ((Math.PI * (getLength() * getLength()))));
    }

    @Override
    public void calcPerimeter() {
        System.out.format("Circle Perimeter " + "%.2f", (Math.PI * 2 * getLength()));
    }

    @Override
    public String printInfo() {
        return super.printInfo() + " Radius=Length";
    }
}
