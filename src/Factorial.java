import java.util.Scanner;

/**
 * Created by Brian on 1/5/17.
 */
public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean keepGoing;
        String userGoing;

        //take userNumber and calculate the factorial
        do {
            int userNumber = getNumber(scan);
            long answer = calculate(userNumber);
           if (userNumber >= 1 && userNumber <= 10) {
               System.out.println("You entered: " + userNumber);
               System.out.println("The factorial for this number is: " + answer);

           } else {
               System.out.println("This is not an integer between 1 and 10!");
           }
           System.out.println("Do you want to continue, y/n");

            //clear empty string
           scan.nextLine();
           userGoing = scan.nextLine();
           if(userGoing.equals("y")){
               keepGoing = true;
           }else{
               keepGoing = false;
               System.out.println("ok bye");
           }
       }while (keepGoing);
    }

    //calculate the factorial
    public static long calculate(int userNumber) {
        long factorial = 1;
        for (int i = 1; i <= userNumber; i++) {
            factorial *=i;
        }
        return factorial;
    }

    //ask user for a number
    public static int getNumber(Scanner scan){
        System.out.println("Enter an integer from 1 to 10: ");
        return scan.nextInt();
    }






}
