import java.util.Scanner;
import java.util.TreeSet;

public class Loader {
    private static final String regex = ".{2,70}@\\w{2,}\\.\\w{2,}";
    private static Scanner scanner = new Scanner(System.in);
    private static TreeSet<String> emailList = new TreeSet<>();

    public static void main(String[] args) {

        System.out.println("Hello!");
        for (; ; ) {
            System.out.println("Type email or (Exit, List):");
            String inputText = scanner.nextLine().trim();

            if (inputText.toUpperCase().equals("EXIT")) {
                System.out.println("Bye!");
                break;
            } else if (inputText.toUpperCase().equals("LIST")) {
                for (String email : emailList) {
                    System.out.println(email);
                }
            } else if (inputText.matches(regex)) {
                emailList.add(inputText);
            } else {
                System.out.println("Error input text.");
            }
        }
    }
}
