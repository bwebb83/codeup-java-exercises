import java.util.Scanner;

/**
 * Created by Brian on 1/6/17.
 */
public class DiceRollingApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        Dice myDice=new Dice(userSides(scan));
        int roll1 = Dice.roll(myDice.userSides);
        int roll2 = Dice.roll(myDice.userSides);
        System.out.println("Your first die rolled " + roll1 + " sides.  Your second die roll is " + roll2 );
    }

    public static int userSides(Scanner scan){
        System.out.println("How many sides does the dice have");
        return scan.nextInt();
    }
}
