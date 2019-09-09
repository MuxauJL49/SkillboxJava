import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int VityaAge;
        int VasyaAge;
        int MikeAge;

        Random rnd = new Random();


        VityaAge = rnd.nextInt(100) + 1;
        do{
            VasyaAge = rnd.nextInt(100) + 1;
        }while(VityaAge == VasyaAge);

        do{
            MikeAge = rnd.nextInt(100) + 1;
        }while (MikeAge == VityaAge || MikeAge == VasyaAge);


        int minAge = (VityaAge < VasyaAge && VityaAge < MikeAge) ? VityaAge :
                     (VasyaAge < VityaAge && VasyaAge < MikeAge) ? VasyaAge :
                      MikeAge;
        int middleAge = ((VityaAge > VasyaAge) && (VityaAge < MikeAge) || (VityaAge < VasyaAge) && (VityaAge > MikeAge)) ? VityaAge :
                        ((VasyaAge > VityaAge) && (VasyaAge < MikeAge) || (VasyaAge < VityaAge) && (VasyaAge > MikeAge)) ? VasyaAge :
                         MikeAge;
        int maxAge = (VityaAge > VasyaAge && VityaAge > MikeAge) ? VityaAge :
                     (VasyaAge > VityaAge && VasyaAge > MikeAge) ? VasyaAge :
                      MikeAge;


        System.out.print("Vitya is " + VityaAge + ".\n" +
                "Vasya is " + VasyaAge + ".\n" +
                "Mike is " + MikeAge + ".\n\n" +
                "Min age is " + minAge + ".\n" +
                "Middle age is " + middleAge + ".\n" +
                "Max age is " + maxAge +".");
    }
}
