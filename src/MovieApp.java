import validator.Validator;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Brian on 1/17/17.
 */
public class MovieApp {
    public static void main(String[] args) {
        //imports
        Scanner scan = new Scanner(System.in);
        Validator validator = new Validator(scan);
        ArrayList<Movie> movies = new ArrayList<>();
        //variable
        boolean keepGoing = true;

        //populates the movies ArrayList
        for (int i = 0; i <= 100; i++) {
            movies.add(MoviesIO.getMovie(i));
        }

        do {
            int userChoice = validator.getIntWithinRange("Welcome!  What kind of movie do you want to watch? 1. Animated 2. Drama 3. Horror 4. Scifi", 1, 4);

            switch (userChoice) {
                case 1:
                    for (Movie m : movies) {
                        if (m.getCategory().contains("animated")) {
                            System.out.println(m.getTitle());
                        }
                    }
                    break;
                case 2:
                    for (Movie m : movies) {
                        if (m.getCategory().contains("drama")) {
                            System.out.println(m.getTitle());
                        }
                    }
                    break;
                case 3:
                    for (Movie m : movies) {
                        if (m.getCategory().contains("horror")) {
                            System.out.println(m.getTitle());
                        }
                    }
                    break;
                case 4:
                    for (Movie m : movies) {
                        if (m.getCategory().contains("scifi")) {
                            System.out.println(m.getTitle());
                        }
                    }
                    break;
            }
            //clear empty string
            scan.nextLine();
            //asks user if they want to go again
            keepGoing = validator.goAgain(keepGoing,scan);
        } while (keepGoing);
    }
}

