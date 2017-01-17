import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Brian on 1/9/17.
 */
public class Validator {


    private Scanner scan;

    public Validator(Scanner scan) {
        this.scan = scan;
    }

    public int getInt(String prompt) {
        System.out.print(prompt);
        int userInt;

        try {
            userInt = scan.nextInt();
        } catch (InputMismatchException e) {
            scan.next();
            System.out.println("Input must be an integer");
            return getInt(prompt);
        }

        return userInt;
    }


    public int getIntWithinRange(String prompt, int min, int max) {
        int userInt = getInt(prompt);

        try {
            if (userInt < min || userInt > max) {
                throw new IllegalArgumentException("Your input must be an integer between " + min + " and " + max);
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return getIntWithinRange(prompt, min, max);
        }

        return userInt;
    }

    public double getDouble(String prompt) {
        System.out.println(prompt);
        double userDouble;

        try {
            userDouble = scan.nextDouble();
        } catch (InputMismatchException e) {
            scan.next();
            System.out.println("Input must be a double");
            return getDouble(prompt);
        }
        return userDouble;
    }

    public static boolean goAgain(boolean keepGoing, Scanner scan) {
        System.out.println("Again? y/n: ");
        String answer = scan.nextLine();
        answer = answer.toLowerCase();
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
