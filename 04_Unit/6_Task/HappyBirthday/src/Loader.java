import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Loader {
    public static void main(String[] args) {

        boolean exitLoop;
        String inputDate;
        Calendar nowDate;
        Calendar happyBirthday;
        Calendar happyBirthdayCal;




        SimpleDateFormat formatDate = new SimpleDateFormat("dd.MM.yyyy - EEEE");
        Calendar calendar = Calendar.getInstance();

        nowDate = new Date(System.currentTimeMillis());
        happyBirthday = new Date(System.currentTimeMillis());
        System.out.println(formatDate.format(date) + " - ");

        do{
            try {
                System.out.println("Type date (format dd.MM.yyyy):");
                Scanner scanner = new Scanner(System.in);
                happyBirthday = new SimpleDateFormat("dd.MM.yyyy").parse(scanner.nextLine());
                exitLoop = true;
            }catch (Exception e){
                System.out.println("Not correct date.");
                exitLoop = false;
            }
        }while(!exitLoop);

        do{
            if(nowDate.compareTo(happyBirthday) > 0){

                happyBirthdayCal.add();
                exitLoop = false;
            }else{
                exitLoop = true;
            }
        }while(!exitLoop);

    }
}
