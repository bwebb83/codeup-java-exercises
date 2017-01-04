import java.util.Scanner;

/**
 * Created by Brian on 1/4/17.
 */
public class IO {
    public static void main(String[] args) {
        //initializes scanner
        Scanner sc = new Scanner(System.in);
        //user types in an integer and is printed back out
        int userInt;
        System.out.println("Type in an integer: ");
        userInt = sc.nextInt();
        System.out.println("You entered: " + userInt);
        //do this to clear the next line after using nextInt
        sc.nextLine();

        //user types in a sentence which is printed back out
        String userString;
        System.out.println("Type in a sentence: ");
        userString= sc.nextLine();
        System.out.println("You typed: " + userString);

        //user enters 3 words which are printed back out on a single line
        String word1;
        String word2;
        String word3;
        System.out.println("Enter the first word: ");
        word1= sc.nextLine();
        System.out.println("Enter the second word: ");
        word2=sc.nextLine();
        System.out.println("Enter the third word: ");
        word3=sc.nextLine();
        System.out.println("You entered: " + word1 + " " + word2 + " " + word3);

        //user enters dimensions of room
        double length;
        double width;
        double height;
        String choice;
        System.out.println("Enter the length of the room: ");
        length = sc.nextDouble();
        System.out.println("Enter the width of the room: ");
        width = sc.nextDouble();
        System.out.println("Enter the height of the room: ");
        height = sc.nextDouble();
        //clear the empty string
        sc.nextLine();
        //user decides if values should be calculated
        System.out.println("Do you want me to calculate the perimeter, are and volume? y/n");
        choice = sc.nextLine();
        if(choice.equals("yes") || choice.equals("y")){
            System.out.println("The perimeter of the room is: " + (2*(length + width)));
            System.out.println("The area of the room is: " + (length * width));
            System.out.println("The volume of the room is: " + (length * width * height));
        } else {
            System.out.println("Ok bye!");
        }
    }
}
