import java.util.Scanner;

/**
 * Created by Brian on 1/17/17.
 */
public class CircleApp {
    public static void main(String[] args) {
        //imports
        Scanner scan = new Scanner(System.in);
        Validator val = new Validator(scan);


        //variables
        boolean keepGoing=true;

        do {
            //get radius from user
            double radius = val.getDouble("Please enter the radius of the circle:");

            //clears empty string
            scan.nextLine();

            //creates new object and runs all methods within circle class
            Circle circle = new Circle(radius);

            //output of formatted circumference and area
            System.out.println("The circumference of the circle is: " + circle.getFormattedCircumference());
            System.out.println("The area of the circle is: " + circle.getFormattedArea());

            //uses validator to see if user wants to enter another radius
            keepGoing = val.goAgain(keepGoing, scan);
        }while(keepGoing);

        //tells user how many circles they created
        System.out.println("You created " + Circle.count + " circles!");
    }


    }

