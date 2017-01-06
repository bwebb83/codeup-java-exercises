import java.util.Scanner;

/**
 * Created by Brian on 1/6/17.
 */
public class HelloObjectWorld {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        Person Person1=new Person(getFirstName(scan), getLastName(scan), getEmail(scan));
        System.out.println("Hello " + Person1.firstName + " " + Person1.lastName+ ", we have your email as: " + Person1.email + ".");
        System.out.println(Person1);

        Person Person2=new Person(getFirstName(scan), getLastName(scan), getEmail(scan));
        System.out.println("Hello " + Person2.firstName + " " + Person2.lastName+ ", we have your email as: " + Person2.email + ".");
        System.out.println(Person2);

        Person Person3=new Person(getFirstName(scan), getLastName(scan), getEmail(scan));
        System.out.println("Hello " + Person3.firstName + " " + Person3.lastName+ ", we have your email as: " + Person3.email + ".");
        System.out.println(Person3);

    }

    public static String getFirstName(Scanner scan){
        System.out.println("Type in your first name: ");
        return scan.nextLine();
    }

    public static String getLastName(Scanner scan){
        System.out.println("Type in your last name: ");
        return scan.nextLine();
    }

    public static String getEmail(Scanner scan){
        System.out.println("Type in your email: ");
        return scan.nextLine();
    }

}
