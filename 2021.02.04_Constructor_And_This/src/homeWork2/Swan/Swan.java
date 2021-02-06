package homeWork2.Swan;

public class Swan {
    String name;
    String color;
    int age;
    String gender;
    boolean ringing;
    int movements;
    int egs;


    public Swan(String name, String color, int age, String gender, boolean ringing, int movements) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.gender = gender;
        this.ringing = ringing;
        this.movements = movements;

    }

    public Swan(String name, String color, int age, boolean ringing, int movements) {
        this(name, color, age, "", ringing, movements);

    }

    public Swan(String name, int age, String gender) {
        this(name, "", age, gender, false, 0);
    }

    public Swan(String name, int age, String gender, boolean ringing, int movements) {
        this(name, "", age, gender, ringing, movements);
    }

    public Swan(String name, String color, int age, String gender) {
        this(name, color, age, gender, false, 0);
    }

    public Swan(String name, String color, int age, boolean ringing) {
        this(name, color, age, "", ringing, 0);
    }

    public Swan(String name, int age, String gender, int egs) {
        this(name, "", age, gender, false, 0);
        this.egs = egs;
    }
}








