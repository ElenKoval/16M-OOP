package figure.data;

public abstract class Figure {
    private double length;

    public Figure() {
    }

    public Figure(double length) {
        if (length > 0) {
            this.length = length;
        }
    }


    public double getLength() {
        return length;
    }

    public String printInfo() {
        return "Length=" + length + ";";
    }

    public void calcSquare() {
        System.out.println("Default Square");
    }

    public void calcPerimeter() {
        System.out.println("Default Perimeter");
    }

}
