import java.util.ArrayList;
import java.util.Scanner;

public class Loader {
    private static ArrayList<String> deals = new ArrayList<>();
    private static final String[] COMMANDS_PATTERNS = new String[]{"LIST", "ADD", "EDIT", "DELETE"};
    private static Scanner scanner = new Scanner(System.in);
    private static String regex = "^(\\w+ \\d*)(.*)";


    public static void main(String[] args) {

        System.out.println(ListMsg.HELLO.getMsg());
        for (; ; ) {

            System.out.println(ListMsg.TYPE.getMsg());
            String inText = scanner.nextLine();

            //exit
            if (inText.toUpperCase().equals("EXIT")) {
                System.out.println(ListMsg.EXIT.getMsg());
                break;
            } else if (inText.toUpperCase().equals(("HELP"))) {
                System.out.println(ListMsg.HELP.getMsg());
                continue;
            }

            try {
                appealToDeals(inText);
            } catch (RuntimeException e) {
                System.out.println(ListMsg.ERROR.getMsg() + " " + e.getMessage());
            }
        }
    }


    //actions with ArrayList
    public static void appealToDeals(String inputText) {
        //text manipulation and check command
        String command = inputText.replaceFirst(regex, "$1").trim();
        String text = inputText.startsWith(command) ? inputText.replaceFirst(regex, "$2").trim() : "";
        int numComand = scanCommand(command.replaceAll("[\\W\\d]", ""));
        if (numComand < 0 || numComand >= COMMANDS_PATTERNS.length || inputText.isEmpty()) {
            throw new RuntimeException("Incorrect input text!");
        }
        int positionInList = checkPosition(command);

        //action
        switch (numComand) {
            case 0:
                //list print
                for (int i = 0; i < deals.size(); i++) {
                    System.out.println((i + 1) + " - " + deals.get(i));
                }
                break;

            case 1:
                //add
                if (positionInList >= 0) {
                    deals.add(positionInList, text);
                } else {
                    deals.add(text);
                }
                break;

            case 2:
                //edit
                if (positionInList >= 0) {
                    deals.set(positionInList, text);
                } else {
                    throw new RuntimeException("Not correct command");
                }
                break;

            case 3:
                //delete
                if (positionInList >= 0) {
                    deals.remove(positionInList);
                } else {
                    throw new RuntimeException("Not correct command");
                }
                break;
        }
    }

    //looking for command from array
    public static int scanCommand(String command) {
        command = command.toUpperCase();
        for (int i = 0; i < COMMANDS_PATTERNS.length && !command.isEmpty(); i++) {
            if (command.equals(COMMANDS_PATTERNS[i])) {
                return i;
            }
        }
        return -1;
    }

    //check position in arrayList deals
    public static int checkPosition(String command) {
        command = command.replaceAll("[^0-9]", "");
        if (!command.isEmpty()) {
            int numPosition = Integer.parseInt(command);
            if (numPosition >= deals.size()) {
                throw new RuntimeException("Not deal in List");
            }
            return numPosition - 1;
        } else {
            return -1;
        }
    }
}
