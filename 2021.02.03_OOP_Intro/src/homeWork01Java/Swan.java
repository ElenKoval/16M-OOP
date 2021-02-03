package homeWork01Java;

public class Swan {
    String color;
    int age;
    String gender;
    boolean ringing;
    int movements;

    public void SwanFlying(int distance) {
        movements += distance;
    }

    public void swanStatistic() {
        System.out.println(ringing ? "Окольцованный " : "Неокольцованный ");
        System.out.println(color + " лебедь" + " возрастом " + age + " лет");
        System.out.println("пролетел " + movements + " км");
        System.out.println(gender == "male" ? "" : "Отложила 5 яиц");
    }

}

class SwanInformation {
    public static void main(String[] args) {
        Swan Solo = new Swan();
        Swan Lea = new Swan();
        Solo.age = 5;
        Solo.SwanFlying(10000);
        Solo.color = "черный";
        Solo.ringing = true;
        Solo.gender = "male";
        Solo.swanStatistic();
        Lea.age = 3;
        Lea.SwanFlying(10000);
        Lea.color = "белый";
        Lea.ringing = true;
        Lea.gender = "female";
        Lea.swanStatistic();
    }

}


