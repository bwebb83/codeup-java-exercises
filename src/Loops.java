import java.util.Scanner;

/**
 * Created by Brian on 1/4/17.
 */
public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //while loop example
        int i = 5;
        while (i <= 15) {
            System.out.println(i);
            i++;
        }
        System.out.println("\n");

        //do while loop example
        int j = 100;
        do {
            System.out.println(j);
            j -= 5;
        } while (j >= -10);
        System.out.println("\n");

        long k = 2;
        do {
            System.out.println(k);
            k = k * k;
        } while (k <= 1000000);
        System.out.println("\n");

        //for examples
        for (int l = 5; l <= 15; l++) {
            System.out.println(l);
        }
        System.out.println("\n");
        for (int m = 100; m >= -10; m -= 5) {
            System.out.println(m);
        }
        System.out.println("\n");

        //fizzbuzz test
        int n = 1;
        while (n <= 100) {
            if ((n % 3) == 0 && (n % 5) == 0) {
                System.out.println("fizzbuzz");
            } else if ((n % 5) == 0) {
                System.out.println("buzz");
            } else if ((n % 3) == 0) {
                System.out.println("fizz");
            } else {
                System.out.println(n);
            }
            n++;
        }
        System.out.println("\n");


        //table of powers
        boolean choice;
        String confirm;
        do {
            int input;
            System.out.println("Enter an integer: ");
            input = sc.nextInt();
            //clearing empty string
            sc.nextLine();
            for (int o = 1; o <= input; o++) {
                System.out.println("|" + o + "|" + o + "^2 = " + (o * o) + "|" + o + "^3= " + (o * o * o) + "|");
            }
            System.out.println("Go again? y/n");
            confirm = sc.nextLine();
            if (confirm.equals("yes") || confirm.equals("y")) {
                choice = true;
            } else {
                choice = false;
                System.out.println("Ok Bye Then!");
            }
        }while(choice);
        System.out.println("\n");




        //grade example
        int grade;
        boolean goAgain;
        String input;
        String letterGrade;
        do {
            System.out.println("Enter your grade: ");
            grade = sc.nextInt();
            //clearing empty string
            sc.nextLine();
            if (grade >= 88 && grade <= 100) {
                letterGrade = "A";
            } else if (grade >= 80 && grade <= 87) {
                letterGrade = "B";
            } else if (grade >= 67 && grade <= 79) {
                letterGrade = "C";
            } else if (grade >= 60 && grade <= 66) {
                letterGrade = "D";
            } else {
                letterGrade = "F";
            }
            System.out.println("You entered: " + grade + ".  Your letter grade is: " + letterGrade);
            System.out.println("Do you want to enter another grade? y/n");
            input=sc.nextLine();
            if(input.equals("yes") || input.equals("y")){
                goAgain=true;
            }else{
                goAgain=false;
                System.out.println("Ok Bye!");
            }
        }while(goAgain);
    }
}

