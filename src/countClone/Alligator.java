package countClone;

/**
 * Created by Brian on 1/20/17.
 */
public class Alligator implements Countable {
    int alligatorCount;

    @Override
    public void incrementCount() {
        alligatorCount++;
    }

    @Override
    public void resetCount() {
        alligatorCount=0;
    }

    @Override
    public int getCount() {
        return alligatorCount;
    }

    @Override
    public String getCountString() {
        String message = getCount() + " alligator";
        return message;
    }
}
