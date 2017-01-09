/**
 * Created by Brian on 1/6/17.
 */
public class Dice {
    int userSides;

    //creating Dice object
    public Dice(int userSides){
        this.userSides=userSides;
    }

    //method used for dice roll
    public static int roll(int userSides){
        return  (int)(Math.random()*userSides) + 1;
    }
}
