/**
 * Created by Brian on 1/6/17.
 */
public class Dice {
    int userSides;

    public Dice(int userSides){
        this.userSides=userSides;
    }

    public static int roll(int userSides){
        return  (int)(Math.random()*userSides) + 1;
    }
}
