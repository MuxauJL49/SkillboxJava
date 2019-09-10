public class Loader {
    public static void main(String[] args) {
        String alphabetEng = "abcdefghliklmnopqrstuvwxyz";
        String alphabetRus = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";

        writeLetter(alphabetEng);
        writeLetter(alphabetRus);
    }

    public static void writeLetter(String alphabet) {
        char letterUper;
        char letter;
        for (int i = 0; ; i++) {
            try {
                letterUper = alphabet.toUpperCase().charAt(i);
                letter = alphabet.charAt(i);
                System.out.println(letterUper + " - " + (int) letterUper + "\n" + letter + " - " + (int) letter);
            } catch (Exception e) {
                break;
            }
        }
    }
}
