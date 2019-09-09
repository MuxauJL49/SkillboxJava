import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int ageVitya;
        int ageVasya;
        int ageMike;

        int minAge;
        int middleAge;
        int maxAge;

        Random rnd = new Random();

        ageVitya = rnd.nextInt(100) + 1;
        do {
            ageVasya = rnd.nextInt(100) + 1;
        } while (ageVitya == ageVasya);

        do {
            ageMike = rnd.nextInt(100) + 1;
        } while (ageMike == ageVasya || ageMike == ageVitya);

        //find max between Vita and Vasya
        if (ageVitya > ageVasya) {
            maxAge = ageVitya;
            middleAge = ageVasya;
        } else {
            maxAge = ageVasya;
            middleAge = ageVitya;
        }

        //Determine the place of Mike
        if (ageMike > maxAge) {
            minAge = middleAge;
            middleAge = maxAge;
            maxAge = ageMike;
        } else if (ageMike > middleAge) {
            minAge = middleAge;
            middleAge = ageMike;
        } else {
            minAge = ageMike;
        }

        System.out.print("Vitya is " + ageVitya + ".\n" +
                "Vasya is " + ageVasya + ".\n" +
                "Mike is " + ageMike + ".\n\n" +
                "Min age is " + minAge + ".\n" +
                "Middle age is " + middleAge + ".\n" +
                "Max age is " + maxAge + ".");
    }
}
