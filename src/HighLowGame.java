import validator.Validator;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Brian on 1/12/17.
 */
public class HighLowGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        Validator val = new Validator(scan);
        int guessNum = 1;
        boolean guessAgain=true;
        int  gameNum = rand.nextInt(100) + 1;
        System.out.println("High Low Game Go!");

        do {
            //gets user guess each time loop is run
            int userGuess = val.getIntWithinRange("Take a guess.  This is guess number: " + guessNum ,1,100);

            //guess is over adds to the guess number counter
            if (userGuess > gameNum) {
                System.out.println("Lower!");
                guessAgain=true;
                guessNum++;
            } else if (userGuess < gameNum) {
                System.out.println("Higher");
                guessAgain=true;
                guessNum++;
            } else if (userGuess == gameNum) {
                System.out.println("You got it!");
                guessAgain=false;
            }
            if(guessNum>20){
                System.out.println("You couldn't get it in 20 guesses!  You lose!  Good day sir!");
                guessAgain=false;
            }
        }while(guessAgain);
    }
}
