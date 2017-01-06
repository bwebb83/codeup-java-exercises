import java.util.Scanner;

/**
 * Created by Brian on 1/5/17.
 */
public class PigLatinTranslator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean keepGoing = true;

            String word = getWord(scan);
            System.out.println("You typed in the word: " + word);
            String translated = translate(word);
            System.out.println(translated);
    }


    public static String getWord(Scanner scan){
        System.out.println("Give me a word!: ");
         return scan.nextLine();

    }

    public static String translate(String word){
        String lower = word.toLowerCase();
        if(lower.startsWith("a") || lower.startsWith("e") || lower.startsWith("i") || lower.startsWith("o") || lower.startsWith("u")){
            String suffix = "way";
            String withSuffix = word + suffix;
        }
        return translate(word);
    }
}
