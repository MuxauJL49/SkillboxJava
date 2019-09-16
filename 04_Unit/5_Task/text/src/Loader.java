import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Loader {
    public static void main(String[] args) {
        Text text = Text.BBC;
        Pattern pattern = Pattern.compile("(\\w|\\d)+-?(\\w|\\d)*");
        Matcher matcher = pattern.matcher(text.getText());
        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
