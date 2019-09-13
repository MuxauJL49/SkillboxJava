

public class Loader {
    public static void main(String[] args) {
        Text text = Text.ENUM_IN_JAVA;
        String inputText = text.getText().replaceAll("[^A-Za-z0-9]", " ");
        for (String word : inputText.split(" +")) {
            System.out.println(word);
        }
    }
}
