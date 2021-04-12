package figure.data;

public class Triangle extends Figure {
    private double sideA;
    private double sideB;
    private double sideCBase;


    public Triangle() {
    }

    public Triangle(double length, double sideA, double sideB, double sideCBase) {
        super(length);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideCBase = sideCBase;
    }

    @Override
    public void calcSquare() {
        System.out.println("Triangle Square= " + ((getLength() * sideCBase)) / 2);
    }

    @Override
    public void calcPerimeter() {
        System.out.println("Triangle Perimeter= " + (sideA + sideB + sideCBase));
    }

    @Override
    public String printInfo() {
        return super.printInfo() + " Side A= " + sideA + "; Side B= " + sideB + "; Side C (base)= " + sideCBase;
    }
}
