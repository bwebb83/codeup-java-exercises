import java.util.Scanner;

/**
 * Created by Brian on 4/19/17.
 */
public class DuplicateEncoder {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);

        //ask user for a word
        System.out.println("Type in a word: ");
        String userString = scan.nextLine();

        System.out.println("You typed in: " + userString);
    }
}
