import java.util.Scanner;

public class Loader {
    public static void main(String[] args) {
        String[][] FIO = {{"Фамилия", ""}, {"Имя", ""}, {"Отчество", ""}};

        System.out.println("Введите (Фамилию Имя Отчество):");
        Scanner scaner = new Scanner(System.in);
        String[] inputText = scaner.nextLine().split(" +");

        for (int i = 0; i <= 2; i++) {
            FIO[i][1] = inputText[i];
            System.out.println(FIO[i][0] + " - " + FIO[i][1]);
        }
    }
}
