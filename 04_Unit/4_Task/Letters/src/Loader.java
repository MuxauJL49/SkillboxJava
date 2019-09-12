public class Loader {
    public static void main(String[] args) {
        String alphabetEng = "abcdefghliklmnopqrstuvwxyz";
        String alphabetRus = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";

        writeLetter(alphabetEng);
        writeLetterWayTwo(alphabetRus);
        writeOnlyEngLetters();
    }

    public static void writeLetter(String alphabet) {
        for (int i = 0; i < alphabet.length() ; i++) {
            char letterUper = alphabet.toUpperCase().charAt(i);
            char letter = alphabet.charAt(i);
            System.out.println(letterUper + " - " + (int) letterUper + "\n" + letter + " - " + (int) letter);
        }
    }

    public static void writeLetterWayTwo(String alphabet) {
        for (int i = 0; i < alphabet.length() ; i++) {
            char letterUper = alphabet.toUpperCase().charAt(i);
            char letter = alphabet.charAt(i);
            System.out.printf("%c - %4d %n", letterUper,(int)letterUper);
            System.out.printf("%c - %4d %n", letter,(int)letter);
        }
    }

    public static void writeOnlyEngLetters(){
        for (char symbol = 'a'; symbol <= 'z'; symbol++){
            char symbolUp = Character.toUpperCase(symbol);
            System.out.printf("%c - %4d %n", symbolUp,(int)symbolUp);
            System.out.printf("%c - %4d %n", symbol,(int)symbol);
        }
    }
}
