package countries;

import validator.Validator;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Brian on 1/23/17.
 */
public class CountriesApp {
    public static void main(String[] args) throws IOException {
        //imports
        Scanner scan = new Scanner(System.in);
        Validator validator = new Validator(scan);
        CountriesTextFile countries = new CountriesTextFile();


        //get user choice
        int choice = validator.getIntWithinRange("1. Display Countries 2. Enter a Country 3. Quit",1,3);


        if(choice == 1){
            countries.create();
            countries.read();
        }else if(choice ==2){
            System.out.println("Enter a country to add to the list");
            String userCountry = scan.nextLine();
            countries.create();

        }else{
            System.out.println("Goodbye!");
        }
    }
}
