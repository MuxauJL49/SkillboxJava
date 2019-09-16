import java.util.ArrayList;
import java.util.Scanner;

public class Loader {
    public static void main(String[] args) {
        ArrayList<String> phoneBook = new ArrayList<>();
        Scanner scaner = new Scanner(System.in);

        for (; ; ) {
            String incorrectFormatMsg = "Incorrect number phone. Try again (+7 999 888 77 66 for example";
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
            String regex = "^([7|8])?\\d{10}";
            String result = inString.matches(regex) ? inString.replaceFirst(regex, "+7 $2") : incorrectFormatMsg;
            if (result == incorrectFormatMsg){
                System.out.println(incorrectFormatMsg);
            }else{
                phoneBook.add(result);
            }
        }
    }

    public static void printBook(ArrayList<String> book) {
        for (String item : book) {
            System.out.println(item);
        }
    }
}
