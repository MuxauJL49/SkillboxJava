import java.sql.SQLOutput;

public class Loader {
    public static void main(String[] args) {
        Cat cat = new Cat();

        System.out.println(cat.getStatus());

        /**
         * Lesson One
         */
        Cat catTema = new Cat();
        Cat catLizi = new Cat();
        Cat catNiki = new Cat();
        Cat catPuppy = new Cat();
        Cat catCrazy = new Cat();
        Cat catSony = new Cat();

        System.out.println("Tema weighs " + catTema.getWeight());
        System.out.println("Lizi weighs " + catLizi.getWeight());
        System.out.println("Niki weighs " + catNiki.getWeight());
        System.out.println("Puppy weighs " + catPuppy.getWeight());
        System.out.println("Crazy weighs " + catCrazy.getWeight());
        System.out.println("Sony weighs " + catSony.getWeight() + "\n");

        System.out.println("Lizi weighs " + catLizi.getWeight() + " gr.");
        catLizi.feed(300d);
        System.out.println("After feeding Lizi weighs " + catLizi.getWeight() + " gr.\n");

        do {
            catPuppy.feed(300d);
        } while (!catPuppy.getStatus().equals("Exploded"));
        System.out.println("Cat Puppy is " + catPuppy.getStatus() + "\n");

        while (!catCrazy.getStatus().equals("Dead")) {
            System.out.print("Cat Crazy: ");
            catCrazy.meow();
        }
        System.out.println("Cat Crazy is " + catCrazy.getStatus() + "\n");


        /**
         * Lesson two
         */
        System.out.println("Cat Puppy ate " + catPuppy.getMassFood() + " food and now it is " +
                catPuppy.getStatus() + "\n");

        System.out.print("Sony: ");
        catSony.goWC();
        System.out.println();


        /**
         * Lesson three
         */
        System.out.println("Cats - " + Cat.getCountCats());
        catLizi.drink(10000d);
        System.out.println("Cats - " + Cat.getCountCats() + "\n");


        /**
         * Lesson four and six
         */
        System.out.println("Cats have " + Cat.EYES + " eyes.");
        System.out.println("Cats' max weight is " + Cat.MAX_WEIGHT + " +-1000");
        System.out.println("Cats' min weight is " + Cat.MIN_WEIGHT + " +-500");
        catSony.setColorCat(catColor.RAINBOW);
        System.out.println("Sony is " + catSony.getColorCat().getNameCl());
        catTema.setColorCat(catColor.BLACK);
        System.out.println("Tema is " + catTema.getColorCat().getNameCl() + "\n");


        /**
         * Lesson five
         */
        Cat catMurka = createCat(5000d);
        System.out.println("New cat Murka weighs " + catMurka.getWeight() + "\n");


        /**
         * Lesson seven
         */
        System.out.println("Cat Carazy is " + catCrazy.getStatus());
        catCrazy.copyCat(catSony);
        System.out.println("After copy. Cat Carazy is " + catCrazy.getStatus());

        System.out.println("Cat Lizi weights " + catLizi.getWeight() +
                "\nCat Tema weighs " + catTema.getWeight());
        Cat.cloneCat(catLizi, catTema);
        System.out.println("After clone. Cat Lizi weights " + catLizi.getWeight() +
                "\nCat Tema weighs " + catTema.getWeight());
    }

    public static Cat createCat (double weight){
        Cat cat = new Cat(weight);
        return cat;
    }
}