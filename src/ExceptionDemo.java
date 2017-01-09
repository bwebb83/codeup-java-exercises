import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Brian on 1/9/17.
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName= firstName(scan);
        String lastName= lastName(scan);
        int age = age(scan);
        Student student1=new Student(firstName,lastName,age);
        System.out.println("The students first name is: " + student1.getFirstName() + ".  The students last name is: " + student1.getLastName() + ".  The students age is: " + student1.getAge());
    }


    public static String firstName(Scanner scan){
        System.out.println("What is the users first name?");
        return scan.nextLine();


    }
    public static String lastName(Scanner scan){
        System.out.println("What is the users last name?");
        return scan.nextLine();
    }

    public static int age(Scanner scan) {
        System.out.println("What is the users age?");
        int userAge;
        try {
            userAge = scan.nextInt();
        }catch(InputMismatchException e){
            scan.next();
            System.out.println("You did not input an appropriate age.");
            return age(scan);
        }
        return userAge;
    }

}

