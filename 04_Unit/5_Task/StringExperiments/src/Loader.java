import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Loader {
    public static void main(String[] args) {
        double result = 0.0d;

        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        System.out.println(text);

        Matcher matcher = Pattern.compile("\\d+\\.?\\d*").matcher(text);
        while (matcher.find()) {
            result += Double.parseDouble(matcher.group());
        }
        System.out.println(result);
    }
}