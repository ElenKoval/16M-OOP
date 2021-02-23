package inheritance;

import inheritance.Person;

public class Worker extends Person {
    private String branch;
    private int section;
    private int daysPerWeek;

    public Worker() {

    }

    public Worker(String firstName, String secondName, String uniID, int age, String gender, String branch, int section, int daysPerWeek) {
        super(firstName, secondName, uniID, age, gender);
        this.branch = branch;
        this.section = section;
        this.daysPerWeek = daysPerWeek;
    }


    void works() {
        System.out.println("Куда по помытому!");
    }


    @Override
    void eats() {
        System.out.println("Выдают паек");
    }
}
