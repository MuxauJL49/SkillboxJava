import java.util.ArrayList;
import java.util.Scanner;

public class Loader {
    public static void main(String[] args) {
        ArrayList<String> phoneBook = new ArrayList<>();
        Scanner scaner = new Scanner(System.in);

        for (; ; ) {
            System.out.println("Type number phone or other command(exit, print)");
            String inString = scaner.nextLine();

            //extra commands
            if (inString.compareToIgnoreCase("exit") == 0) {
                break;
            }
            if (inString.compareToIgnoreCase("print") == 0) {
                printBook(phoneBook);
                continue;
            }

            inString = inString.replaceAll("[^\\d]", "");
            if (inString.length() == 10) {
                phoneBook.add(7 + inString);
            } else if (inString.length() == 11) {
                phoneBook.add(7 + inString.substring(1));
            } else {
                System.out.println("Incorrect number phone. Try again (+7 999 888 77 66 for example");
            }
        }
    }

    public static void printBook(ArrayList<String> book) {
        for (String item : book) {
            System.out.println(item);
        }
    }
}
