public class Zmey extends Animal {
    private String color;


    public Zmey(String name, boolean zooBorns, int age, String eatingType, String color) {
        super(name, zooBorns, age, eatingType);
        this.color = color;
    }

    void eats() {
        this.drinks();

    }

    void drinks() {
        System.out.println("Only tears");
    }


    void movies() {
        this.flies();
    }

    void flies() {
        System.out.println("Zmey flight speed -120 km per hour ");
    }

    @Override
    void sleeps() {
        System.out.println("When  sleeps - Never");

    }

    @Override
    public String toString() {
        return "Zmey " + "with name " + name + ",born in Zoo: " + zooBorns + ", age: " + age + ", eats: " + eatingType
                + " color: " + color;
    }
}
