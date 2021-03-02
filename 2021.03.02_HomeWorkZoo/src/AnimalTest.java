public class AnimalTest {
    public static void main(String[] args) {
        System.out.println("Our animals: ");
        Bat betty = new Bat("Betty", true, 2, "omnivores");
        System.out.println(betty.toString());
        betty.orientates();
        betty.sleeps();
        betty.eats();
        System.out.println("***************");

        Panda fluffy = new Panda("Fluffy", true, 4, "herbivores");
        System.out.println(fluffy.toString());
        fluffy.eats();
        fluffy.sleeps();
        fluffy.movies();
        System.out.println("***************");

        Eagle chicken = new Eagle("Сhicken", true, 3, "carnivores");
        System.out.println(chicken.toString());
        chicken.flies();
        chicken.eats();
        chicken.sleeps();
        System.out.println("***************");

        Zmey gorik = new Zmey("Gorik", false, 378, "carnivores", "black");
        System.out.println(gorik.toString());
        gorik.drinks();
        gorik.flies();
        gorik.sleeps();
        System.out.println("***************");


    }
}
