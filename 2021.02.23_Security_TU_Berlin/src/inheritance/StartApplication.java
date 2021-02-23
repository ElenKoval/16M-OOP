package inheritance;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;

public class StartApplication {
    public static void main(String[] args) {
        Seminar winterSeminar = new Seminar(10);
        Student pasha = new Student("Pasha", "Petrov", "66324", 22, "male", 3, true);
        winterSeminar.addMembers(pasha);
        Student sveta = new Student("Sveta", "Lomaeva", "65499", 20, "female", 3, true);
        winterSeminar.addMembers(sveta);
        Student larisa = new Student("Larisa", "Toraeva", "34420", 18, "female", 3, true);
        winterSeminar.addMembers(larisa);
        Student oleg = new Student("Oleg", "Kitaev", "23411", 22, "male", 5, false);
        winterSeminar.addMembers(oleg);
        Person dasha = new Student("Dasha", "Ivanova", "98022", 22, "female", 4, true);
        winterSeminar.addMembers(dasha);
        Person oksana = new Teacher("Oksana", "Koneva", "34555", 38, "high", "Math", 2345.89, true);
        winterSeminar.addMembers(oksana);
        Person stiven = new Teacher("Stiven", "Green", "23211", 59, "proff", "Biology", 3567.90, true);
        winterSeminar.addMembers(stiven);
        Person monika = new Teacher("Monica", "Green", "24411", 48, "proff", "Assist", 3000.90, false);


        System.out.println("Участники зимнего семинара в количестве " + winterSeminar.size + " человек");
        newSort(winterSeminar);
        printSeminar(winterSeminar);
        winterSeminar.updateMembers(stiven, monika);
        printSeminar(winterSeminar);


    }

    public static void newSort(Seminar winterSeminar) {
        int start = 0;
        int end = winterSeminar.size - 1;
        while (start <= end) {
            boolean swap = false;
            for (int i = start; i < end; i++) {
                if (winterSeminar.members[i].getAge() > winterSeminar.members[i + 1].getAge()) {
                    Person temp = winterSeminar.members[i];
                    winterSeminar.members[i] = winterSeminar.members[i + 1];
                    winterSeminar.members[i + 1] = temp;
                    swap = true;
                }
            }

            end--;
            for (int i = end; i > start; i--) {
                if (winterSeminar.members[i].getAge() < winterSeminar.members[i - 1].getAge()) {
                    Person temp = winterSeminar.members[i - 1];
                    winterSeminar.members[i - 1] = winterSeminar.members[i];
                    winterSeminar.members[i] = temp;
                    swap = true;
                }
            }
            start++;
            if (!swap) {
                break;
            }
        }
    }

    public static void printSeminar(Seminar winterSeminar) {
        for (int i = 0; i < winterSeminar.size; i++) {
            System.out.println(winterSeminar.members[i].toString());
        }
    }


}


//    private static void lessonstart(){
//        Student sasha=new Student();
//        sasha.study();
//        sasha.eats();
//        Teacher tch=new Teacher();
//        Student glasha=new Student("Glasha", "Petrova", "2021747",20,"gemale",3,false);
//        System.out.println(glasha);
//        Person ps=new Person();
//        System.out.println("__________________");
//        System.out.println(ps);
//        System.out.println("__________");
//        System.out.println("teacher 1");
//        System.out.println(tch);
//    }
