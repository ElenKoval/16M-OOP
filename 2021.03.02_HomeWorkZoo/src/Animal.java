abstract class Animal {
    String name;
    boolean zooBorns;
    int age;
    String eatingType;

    public Animal(String name, boolean zooBorns, int age, String eatingType) {
        this.name = name;
        this.zooBorns = zooBorns;
        this.age = age;
        this.eatingType = eatingType;
    }

    abstract void eats();

    abstract void movies();

    abstract void sleeps();

}

