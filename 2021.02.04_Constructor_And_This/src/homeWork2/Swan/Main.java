package homeWork2.Swan;

public class Main {
    public static void main(String[] args) {
        Swan swan01 = new Swan("Luke", "White", 3, "Male", true,
                100);
        Swan swan02 = new Swan("Obivan", "White", 7, false, 60);
        Swan swan03 = new Swan("HanSolo", "Black", 5, "Male");
        Swan swan04 = new Swan("Leia", 3, "Female", true, 50);
        Swan swan05 = new Swan("Anakin", "Black", 4, "Male");
        Swan swan06 = new Swan("KyloRen", "Black", 2, true);
        Swan swan07 = new Swan("Padme", 3, "Female", 4);
        System.out.println("Лебедь " + swan01.name + " пролетел " + swan01.movements +
                "км");
        System.out.println("Лебедь " + swan05.name + (swan05.age > swan06.age ? " старше на " +
                (swan05.age - swan06.age) + " года " : " младше на " + (swan06.age - swan05.age) + " года ")
                + "лебедя " + swan06.name);
        Swan[] flock = new Swan[]{swan01, swan02, swan03, swan04, swan05, swan06, swan07};
        swanOld(flock);
        System.out.print("Возраст лебедей в стае распределен следующим образом: ");
        swanSort(flock);
    }

    private static void swanOld(Swan[] flock) {
        int countBlack = 0;
        int countWhite = 0;
        for (Swan swan : flock) {
            if (swan.age > 3 && swan.color == "Black") {
                countBlack++;
            } else if (swan.age > 3 && swan.color == "White") {
                countWhite++;
            }
        }
        System.out.println("Большинство взрослых лебедей в стае " + (countBlack > countWhite ? "черного цвета " :
                "белого цвета"));
    }


    private static void swanSort(Swan[] flock) {
        boolean unsorted = true;
        while (unsorted) {
            unsorted = false;
            for (int i = 0; i < flock.length - 1; i++) {
                if (flock[i].age > flock[i + 1].age) {
                    int temp = flock[i].age;
                    flock[i].age = flock[i + 1].age;
                    flock[i + 1].age = temp;
                    unsorted = true;
                }
            }
        }
        System.out.print("[");
        for (int i = 0; i < flock.length - 1; i++) {
            System.out.print(flock[i].age + ", ");
        }
        System.out.println(flock[flock.length - 1].age + "]");
    }
}







