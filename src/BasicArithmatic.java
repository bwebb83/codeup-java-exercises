import java.util.Scanner;

/**
 * Created by Brian on 1/5/17.
 */
public class BasicArithmatic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //asks user for 2 numbers
        System.out.println("Type in a number: ");
        int firstNumber = scan.nextInt();
        System.out.println("Type in a second number: ");
        int secondNumber = scan.nextInt();

        //gives addition answer
        int addAnswer= addition(firstNumber, secondNumber);
        System.out.println("Your addition answer is: " + addAnswer);

        //gives subtraction answer
        int subAnswer = subtraction(firstNumber, secondNumber);
        System.out.println("Your subtraction answer is: " + subAnswer);

        //gives multiplication answer
        int multiAnswer = multiplication(firstNumber, secondNumber);
        System.out.println("Your multiplication answer is: " + multiAnswer);

        //gives division answer
        double divAnswer = division(firstNumber, secondNumber);
        System.out.println("Your division answer is: " + divAnswer);

        //gives modulo answer
        int modAnswer = modulo(firstNumber, secondNumber);
        System.out.println("Your modulo is: " + modAnswer);
    }


    //method for addition
    public static int addition(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }

    //method for subtraction
    public static int subtraction(int firstNumber, int secondNumber){
        return firstNumber - secondNumber;
    }

    //method for multiplication
    public static int multiplication(int firstNumber, int secondNumber){
        return firstNumber * secondNumber;
    }

    //method for division
    public static double division(int firstNumber, int secondNumber){
        if(secondNumber == 0){
            System.out.println("Cannot divide by zero!");
            return 0;
        }
        return (double) firstNumber / secondNumber;
    }

    //method for modulo
    public static int modulo(int firstNumber, int secondNumber){
        return firstNumber % secondNumber;
    }







}
