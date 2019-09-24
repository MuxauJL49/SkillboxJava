import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Loader {
    private static TreeMap<String, String> phonebook = new TreeMap<>();
    private static String REGEX_NUM_PHONE = ("^([7|8])?(\\d{10}$)");
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Welcome to the phone book!");
        for (; ; ) {

            System.out.println("Type name or phone number (extra command \"Exit\" \"LIST\")");
            String inputText = scanner.nextLine().trim();
            if (inputText.toUpperCase().equals("LIST")) {
                printMap(phonebook);
            } else if (inputText.toUpperCase().equals("EXIT")) {
                System.out.println("Bye!");
                break;
            } else if (!phonebookReference(inputText)) {
                System.out.println("Error in input data. Try again.");
            }
        }
    }


    private static boolean phonebookReference(String inputText) {

        if (checkNameOrPhone(inputText)) {
            return true;
        }

        String name = inputText.replaceAll("\\d", "");
        String phone = inputText.replaceAll("\\D", "");
        phone = phone.matches(REGEX_NUM_PHONE) ? phone.replaceFirst(REGEX_NUM_PHONE, "$2") : "";
        if (!phone.isEmpty() && name.isEmpty()) {
            System.out.println("Type name for " + phone + " number:");
            name = scanner.nextLine().replaceAll("\\d", "");
        } else if (!name.isEmpty()) {
            System.out.println("Type phone number for " + name);
            phone = scanner.nextLine().replaceAll("\\D", "");
            phone = phone.replaceAll(REGEX_NUM_PHONE, "$2");
        } else {
            name = "";
            phone = "";
        }

        if (!name.isEmpty() && !phone.isEmpty()) {
            phonebook.put(name, phone);
            return true;
        }
        return false;
    }

    //Check name or phone in phone book and print it
    private static boolean checkNameOrPhone(String inputText) {
        if (phonebook.containsKey(inputText)) {
            System.out.println("Name/phone: " + inputText + " - +7 " + phonebook.get(inputText));
            return true;
        }
        inputText = inputText.replaceAll(REGEX_NUM_PHONE, "$2");
        if (phonebook.containsValue(inputText)) {
            for (String key : phonebook.keySet()) {
                if (phonebook.get(key).equals(inputText)) {
                    System.out.println("Name/phone: " + key + " - +7 " + inputText);
                    return true;
                }
            }
        }
        return false;
    }

    private static void printMap(Map<String, String> map) {
        for (String key : map.keySet()) {
            System.out.println("Name/phone: " + key + " - +7 " + map.get(key));
        }
    }
}
