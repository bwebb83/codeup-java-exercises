import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Created by Brian on 1/11/17.
 */
public class BattingStatistics {
    public static void main(String[] args) {
        //import scanner, validator and number formatter
        Scanner scan = new Scanner(System.in);
        Validator validator = new Validator(scan);
        NumberFormat formatter = new DecimalFormat("#0.000");
        boolean keepGoing = true;

        do {
            //ask user how many at bats and validates that the value is an int
            int atBats = validator.getInt("How many times did the batter go to bat?");
            int[] basesEarned = new int[atBats];

            //ask how many bases were earned for every at bat
            for (int i = 0; i <basesEarned.length; i++) {
                basesEarned[(i)] = validator.getIntWithinRange("How many bases were earned on bat #" + (i+1) + "?  Enter a number between 0 and 4.", 0, 4);

            }

            //clears blank line after getting int for bases
            scan.nextLine();

            //sout all the info
            System.out.println(Arrays.toString(basesEarned));
            System.out.println("The Batting Average of the player is: " + formatter.format(battingAvg(basesEarned, atBats)));
            System.out.println("The Slugging Percentage of the player is: " + formatter.format(slugging(basesEarned, atBats)));

            //returns the value of goAgain boolean to keepGoing
            keepGoing = goAgain(keepGoing, scan);

        } while (keepGoing);
    }

    //method to calculate batting average
    public static float battingAvg(int[] basesEarned, int atBats) {
        int onBase = 0;
        for (int i = 0; i < basesEarned.length; i++) {
            if (basesEarned[i] > 0) {
                onBase++;
            }
        }
        return (float) onBase / atBats;
    }

    //method to calculate slugging percentage
    public static float slugging(int[] basesEarned, int atBats) {
        int sum = IntStream.of(basesEarned).sum();
        return (float) sum / atBats;
    }

    //get user input to repeat main
    public static boolean goAgain(boolean keepGoing, Scanner scan) {
        System.out.println("Another batter? y/n: ");
        String answer = scan.nextLine();
        answer=answer.toLowerCase();
        if (answer.equals("n")) {
            System.out.println("Ok bye!");
            keepGoing = false;
        } else if (answer.equals("y")) {
            keepGoing = true;
        } else {
            System.out.println("Not a valid key.");
            return goAgain(keepGoing, scan);
        }
        return keepGoing;
    }
}
