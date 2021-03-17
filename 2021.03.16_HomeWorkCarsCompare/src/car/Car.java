package car;

public class Car implements Comparable<Car> {
    private int year;
    private String model;
    private String colour;
    private double engine;
    private double price;

    public Car(int year, String model, String colour, double engine, double price) {
        super();
        this.year = year;
        this.model = model;
        this.colour = colour;
        this.engine = engine;
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", engine=" + engine +
                ", price=" + price +
                '}';
    }

    public int compareTo(Car c) {
        return model.compareTo(c.model);
    }


}
