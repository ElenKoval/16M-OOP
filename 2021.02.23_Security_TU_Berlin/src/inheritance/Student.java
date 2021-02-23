package inheritance;

import inheritance.Person;

public class Student extends Person {
    private int yearAtUniversity;
    private boolean studentAssociations;

    public Student(String firstName, String secondName, String uniID, int age, String gender, int yearAtUniversity, boolean studentAssociations) {
        super(firstName, secondName, uniID, age, gender);
        this.yearAtUniversity = yearAtUniversity;
        this.studentAssociations = studentAssociations;
    }


    public Student() {
        super();
    }

    public int getYearAtUniversity() {
        return yearAtUniversity;
    }

    public void setYearAtUniversity(int yearAtUniversity) {
        this.yearAtUniversity = yearAtUniversity;
    }

    public boolean isStudentAssociations() {
        return studentAssociations;
    }

    public void setStudentAssociations(boolean studentAssociations) {
        this.studentAssociations = studentAssociations;
    }

    @Override
    void eats() {
        super.eats();
        System.out.println("Обед в 12:00");
    }

    void study() {
        System.out.println("Обучение в процессе");
    }

    void internships() {
        System.out.println("Стажировка начата");
    }

    @Override
    public String toString() {
        return super.toString() + "Участие в студенческой ассоциации: " + (studentAssociations == true ? "Состоит " : "Не состоит") + "\n";
    }
}
