import java.util.Scanner;

/**
 * Created by Brian on 1/5/17.
 */
public class PigLatinTranslator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean keepGoing = true;
        String word = getWord(scan);
        word = word.toLowerCase();
        System.out.println("You typed in the word: " + word);
        System.out.println(translate(word));


        // String translated = translate(word);
//            System.out.println(translated);
    }


    public static String getWord(Scanner scan) {
        System.out.println("Give me a word!: ");
        return scan.nextLine();

    }

    public static String translate(String word) {
        String translated = "";
        for (int i = 0; i <= word.length(); i++) {
            if (word.charAt(i) == 'a' | word.charAt(i) == 'e' | word.charAt(i) == 'i' | word.charAt(i) == 'o' | word.charAt(i) == 'u') {
                translated = word.substring(i) + word.substring(0, i) + "way";
                break;
            } else {
                translated = word + "ay";
            }
        }
        return translated;
    }
}
