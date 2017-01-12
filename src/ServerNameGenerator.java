import java.util.Random;

/**
 * Created by Brian on 1/11/17.
 */
public class ServerNameGenerator {
    public static void main(String[] args) {
        String[] adjectives={"Hot", "Green", "Awesome", "Bumpy", "Weird", "Sloppy", "Angry", "Orange", "Salty", "Horseface"};
        String[] nouns={"Bird", "Car", "Brother", "Computer", "Glasses", "Food", "Phone", "Dog", "Tissue", "Oden"};
        getRandom(adjectives, nouns);

    }

    public static void getRandom(String[] adjectives, String[] nouns) {
        Random random= new Random();
        int index1=random.nextInt(adjectives.length);
        int index2=random.nextInt(nouns.length);
        System.out.println("Your server name is: " + adjectives[index1] +  " " +  nouns[index2]);
    }

}
