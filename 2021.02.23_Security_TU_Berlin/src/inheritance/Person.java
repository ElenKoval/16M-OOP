package inheritance;

public class Person {
    private String firstName;
    private String secondName;
    private String uniID;
    private int age;
    private String gender;


    public Person(String firstName, String secondName, String uniID, int age, String gender) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.uniID = uniID;
        this.age = age;
        this.gender = gender;
    }


    public Person() {

    }

    void eats() {
        System.out.println("am 12:00");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getUniID() {
        return uniID;
    }

    public void setUniID(String uniID) {
        this.uniID = uniID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Имя " + firstName + "\n" +
                "Фамилия " + secondName + "\n" +
                "Возраст " + age + "\n";
    }

}
