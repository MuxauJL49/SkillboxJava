
public class Main {
    public static void main(String[] args) {

        for (int i = 20000; i < 235000; i++){
            if (i == 210000)
                i = 220000;

            System.out.println("Loop \"for\" - " + i);
        }



        int i = 200000;

        while(i < 235000){
            if (i == 210000)
                i = 220000;
            System.out.println("Loop \"while\" - " + i);
            i++;
        }
    }
}
