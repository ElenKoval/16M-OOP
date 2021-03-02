public class Bat extends Animal {
    public Bat(String name, boolean zooBorns, int age, String eatingType) {
        super(name, zooBorns, age, eatingType);
    }

    void movies() {
        this.orientates();
    }

    void orientates() {
        System.out.println("Orientates - with echolocation ");
    }

    @Override
    void eats() {
        System.out.println("Eats - Mouse, insect");

    }


    @Override
    void sleeps() {
        System.out.println("When  sleeps  - Day");

    }

    @Override
    public String toString() {
        return "Bat " + "with name-" + name + ",born in Zoo: " + zooBorns + ", age: " + age + ", eats " + eatingType;
    }
}

