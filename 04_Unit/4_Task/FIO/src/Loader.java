import java.util.Scanner;

public class Loader {
    public static void main(String[] args) {
        String[][] FIO = {{"Фамилия", ""}, {"Имя", ""}, {"Отчество", ""}};
        Scanner scaner = new Scanner(System.in);
        String[] inputTextArr;

        System.out.println("Введите (Фамилию Имя Отчество):");
        String inputText = scaner.nextLine();


        if (inputText.contains(" ")) {
            inputTextArr = inputText.split(" +");
        } else {
            inputTextArr = new String[]{"", inputText, ""};
        }

        for (int i = 0; i <= 2; i++) {
            if(inputTextArr.length - 1 < i) {
                break;
            }
            FIO[i][1] = inputTextArr[i];
        }

        printFIO(FIO);
    }


    public static void printFIO(String[][] FIO) {
        for (String[] item : FIO) {
            if (!item[1].equals("")) {
                System.out.println(item[0] + " - " + item[1]);
            }
        }
    }
}
