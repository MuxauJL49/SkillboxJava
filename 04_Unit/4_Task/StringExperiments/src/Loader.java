
public class Loader {
    public static void main(String[] args) {
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";

        System.out.println(text);

        double result = 0.0d;

        result += findAmount("Вася", text);
        result += findAmount("Маша", text);
        //for check filter
        result += findAmount("Коля", text);
        System.out.println("Result is " + result);
    }

    public static double findAmount(String name, String text) {
        String foundAmount = "";

        //filter for incorrect name
        if (!text.contains(name)) {
            return 0.0d;
        }

        for (int indx = text.indexOf(name); ; indx++) {
            try {
                Double.parseDouble(Character.toString(text.charAt(indx)));
                foundAmount = text.substring(indx, text.indexOf(" ", indx));
                break;
            } catch (Exception e) {
                if (indx > text.length()) {
                    return 0.0d;
                }
            }
        }
        return Double.parseDouble(foundAmount);
    }
}