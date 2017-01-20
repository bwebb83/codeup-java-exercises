package roshambo;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * Created by Brian on 1/20/17.
 */
public class Console {
    private Scanner input = new Scanner(System.in);
    private PrintStream output = System.out;

    public String prompt(String message) {
        output.println(message);
        return input.next();
    }
}
