import java.util.*;

public class Loader {
    private static ArrayList<String> vipCarArr = new ArrayList<>();
    private static TreeSet vipCarTree = new TreeSet();
    private static HashSet vipCartHach = new HashSet();
    private static long[] time = new long[]{0, 0};
    private static int REGION = 197;
    private static String[] LETTER_IN_NUMBER = {"A", "B", "E", "K", "M", "H", "O", "P", "C", "T", "Y", "X"};
    private static Scanner scanner = new Scanner(System.in);
    private static String REGEX_CAR_NUMBER = "(A|B|E|K|M|H|O|P|C|T|Y|X)(\\d{3})(A|B|E|K|M|H|O|P|C|T|Y|X){2}(\\d{2,3})";

    public static void main(String[] args) {

        fillNumbers();

        for (; ; ) {
            boolean resultSearch;
            System.out.println("Type vip car number (eng letter) or exit:");
            String inputText = scanner.nextLine().toUpperCase().trim();

            if (inputText.equals("EXIT")) {
                System.out.println("Bye!");
                break;
            } else if (!inputText.matches(REGEX_CAR_NUMBER)) {
                System.out.println("Not correct number! Try again.");
                continue;
            }


            time[0] = System.nanoTime();
            resultSearch = vipCarArr.contains(inputText);
            time[1] = System.nanoTime();
            System.out.println("ArrayList(contains) = " + resultSearch + "  number - " + inputText + " Time - " + (time[1] - time[0]));

            time[0] = System.nanoTime();
            int positionItem = Collections.binarySearch(vipCarArr, inputText);
            time[1] = System.nanoTime();
            resultSearch = positionItem >= 0;
            System.out.println("ArrayList(binarySearch)= " + resultSearch + " number - " + inputText + " Time - " + (time[1] - time[0]));

            time[0] = System.nanoTime();
            resultSearch = vipCartHach.contains(inputText);
            time[1] = System.nanoTime();
            System.out.println("HashSet(contains) = " + resultSearch + " number - " + inputText + " Time - " + (time[1] - time[0]));


            time[0] = System.nanoTime();
            resultSearch = vipCarTree.contains(inputText);
            time[1] = System.nanoTime();
            System.out.println("TreeSet(contains) = " + resultSearch + " number - " + inputText + " Time - " + (time[1] - time[0]));
        }
    }


    private static void fillNumbers() {
        for (int i = 0; i < REGION; i++) {
            String reg = "";
            if (i < 9) {
                reg += 0;
                reg += i + 1;
            } else {
                reg += (i + 1);
            }

            for (String letterOne : LETTER_IN_NUMBER) {
                for (int j = 0; j < 10; j++) {
                    String num = "";
                    num += letterOne + j + j + j;
                    for (String letterTwo : LETTER_IN_NUMBER) {
                        for (String letterThree : LETTER_IN_NUMBER) {
                            String number = num;
                            number += letterTwo + letterThree + reg;
                            vipCarArr.add(number);
                            vipCartHach.add(number);
                            vipCarTree.add(number);
                        }
                    }
                }
            }
        }
        Collections.sort(vipCarArr);
    }
}
