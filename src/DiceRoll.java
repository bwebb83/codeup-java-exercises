import java.util.Scanner;

/**
 * Created by Brian on 1/5/17.
 */
public class DiceRoll {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean keepGoing;

        //do while loop to output dice rolls and ask if user wants to go again
        do{
            int userSides = diceSides(scan);
            int dice1 = diceRoll(userSides);
            int dice2 = diceRoll(userSides);
            System.out.println("So you want to roll a " + userSides + " sided dice.");
            System.out.println("The result of the first dice is: " + dice1);
            System.out.println("The result of the first dice is: " + dice2);
            System.out.println("Roll again? y/n");
            scan.nextLine();
            String again = scan.nextLine();
            if(again.equals ("y")){
                keepGoing = true;
            }else {
                keepGoing = false;
                System.out.println("Ok bye!");
            }
        }while (keepGoing);
    }

    //method to obtain how many sides the user wants
    public static int diceSides(Scanner scan){
        System.out.println("How many sides do the dice have?");
        return scan.nextInt();
    }

    //method to get a random number for first dice roll
    public static int diceRoll(int userSides){
        return  (int)(Math.random()*userSides) + 1;
    }

}
