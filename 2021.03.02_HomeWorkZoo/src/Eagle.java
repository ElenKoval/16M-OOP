public class Eagle extends Animal {
    public Eagle(String name, boolean zooBorns, int age, String eatingType) {
        super(name, zooBorns, age, eatingType);
    }


    void movies() {
        this.flies();
    }

    void flies() {
        System.out.println("Eagles flight speed -320 km per hour ");
    }

    @Override
    void eats() {
        System.out.println("Mouse, other small animals");

    }


    @Override
    void sleeps() {
        System.out.println("When  sleeps - Night");

    }

    @Override
    public String toString() {
        return "Eagle " + "with name" + name + ",born in Zoo " + zooBorns + ", age: " + age + ", eats" + eatingType;
    }
}
