public class Panda extends Animal {

    public Panda(String name, boolean zooBorns, int age, String eatingType) {
        super(name, zooBorns, age, eatingType);
    }

    @Override
    void movies() {
        System.out.println("Movies- One meter per year");

    }

    @Override
    void eats() {
        System.out.println("Eats-Only Bamboo");

    }


    @Override
    void sleeps() {
        System.out.println("When  sleeps -Alwayes");

    }

    @Override
    public String toString() {
        return "Panda " + "with name " + name + ",born in Zoo " + zooBorns + ", age: " + age + ", eats " + eatingType;
    }
}


