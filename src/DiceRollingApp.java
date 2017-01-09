import java.util.Scanner;

/**
 * Created by Brian on 1/6/17.
 */
public class DiceRollingApp {
    public static void main(String[] args) {
        //initializing scanner
        Scanner scan = new Scanner(System.in);
        boolean keepGoing;

        do {
            //dice object with user sides
            int numberOfSides=userSides(scan);
            Dice myDice1 = new Dice(numberOfSides);
            Dice myDice2= new Dice (numberOfSides);
            //roll dice
            int roll1 = Dice.roll(myDice1.userSides);
            int roll2 = Dice.roll(myDice2.userSides);
            System.out.println("Your first die rolled: " + roll1 + " sides.  Your second die roll is: " + roll2 + ".  The total of the two sides is: " + (roll1 + roll2) + ".");
            System.out.println("Do you want to roll again? y/n?");
            //clear blank string
            scan.nextLine();
            String again = scan.nextLine();
            //asks user if they want to go again
            if (again.equals("y")) {
                keepGoing = true;
            } else {
                keepGoing = false;
                System.out.println("Ok bye!");
            }
        }while (keepGoing) ;
    }

    //asks user how many sides they want the dice to have
    public static int userSides(Scanner scan){
        System.out.println("How many sides does the dice have");
        return scan.nextInt();
    }
}
