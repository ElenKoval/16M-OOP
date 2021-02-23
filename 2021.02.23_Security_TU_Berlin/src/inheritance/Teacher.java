package inheritance;

import inheritance.Person;

public class Teacher extends Person {
    private String subject;
    private double salary;
    private boolean bonus;

    public Teacher() {
    }

    public Teacher(String firstName, String secondName, String uniID, int age, String position, String subject, double salary, boolean bonus) {
        super(firstName, secondName, uniID, age, position);
        this.subject = subject;
        this.salary = salary;
        this.bonus = bonus;
    }


    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setBonus(boolean bonus) {
        this.bonus = bonus;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    void eats() {
        super.eats();
        System.out.println("Завтрак в 09:00");
    }

    void teach() {
        System.out.println("Записывайте");
    }

    void vacations() {
        System.out.println("Я с завтрашнего дня в отпуске!");
    }


    @Override
    public String toString() {
        return super.toString() + "Зарплата " + salary + "\n";
    }

}
