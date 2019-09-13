import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Loader {
    public static void main(String[] args) {
        String[][] FIO = {{"Фамилия", ""}, {"Имя", ""}, {"Отчество", ""}};
        Scanner scaner = new Scanner(System.in);
        String[] inputTextArr;

        System.out.println("Введите (Фамилию Имя Отчество):");
        String inputText = scaner.nextLine().trim();


        Matcher matcher = Pattern.compile("\\w+").matcher(inputText);
        for(int i = 0; matcher.find(); i++){
            if(i == FIO.length){
                break;
            }else if(inputText.contains(" ")){
                FIO[i][1] = matcher.group();
            }else{
                FIO[1][1] = matcher.group();
                break;
            }
        }
        printFIO(FIO);
    }

    private static void printFIO(String[][] FIO) {
        for (String[] item : FIO) {
            if (!item[1].equals("")) {
                System.out.println(item[0] + " - " + item[1]);
            }
        }
    }
}
