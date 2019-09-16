import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class Loader {
    public static void main(String[] args) {
        boolean exitLoop;
        LocalDate nowDate = LocalDate.now();
        LocalDate happyBirthday = null;
        DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("d.M.yyyy");
        Locale localeRu = new Locale("ru");

        //input dialog with user
        do {
            try {
                System.out.println("Type date (format dd.MM.yyyy):");
                Scanner scanner = new Scanner(System.in);
                String inputDate = scanner.nextLine().replaceAll("[^\\d\\.]", "").trim();
                /* old shit
                if (inputDate.matches("\\d{1,2}\\.\\d{1,2}\\.\\d\\d\\d\\d")) {
                    String[] inTextArr = inputDate.split("\\.");
                    inputDate = "";
                    for (int i = 0; i < 3; i++) {
                        if (i == 2) {
                            inputDate += inTextArr[i];
                        } else if (inTextArr[i].length() == 1) {
                            inputDate += "0" + inTextArr[i] + ".";
                        } else {
                            inputDate += inTextArr[i] + ".";
                        }
                    }
                }*/
                happyBirthday = LocalDate.parse(inputDate, formatDate);
                exitLoop = true;
            } catch (DateTimeParseException e) {
                System.out.println("Not correct date.");
                exitLoop = false;
            }
        } while (!exitLoop);


        //print all days
        for (int year = 0; ; year++) {
            var d = happyBirthday;
            if (nowDate.compareTo(d) > 0) {
                System.out.println(year + " - " + d.format(formatDate) + " " +
                        d.getDayOfWeek().toString() + "(" +
                        d.getDayOfWeek().getDisplayName(TextStyle.FULL, localeRu) +
                        ")");
                happyBirthday = d.plusYears(1);
            } else {
                break;
            }
        }

/*        counter = 0;
        do {
            if (nowDate.compareTo(happyBirthday) > 0) {
                System.out.println(counter + " - " + happyBirthday.format(formatDate) + " " +
                        happyBirthday.getDayOfWeek().toString() + "(" +
                        happyBirthday.getDayOfWeek().getDisplayName(TextStyle.FULL, new Locale("ru")) +
                        ")");
                happyBirthday = happyBirthday.plusYears(1);
                exitLoop = false;
                counter++;
            } else {
                exitLoop = true;
            }
        } while (!exitLoop);
        counter = 0;*/
    }
}
