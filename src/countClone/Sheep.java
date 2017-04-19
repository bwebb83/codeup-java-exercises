package countClone;

/**
 * Created by Brian on 1/20/17.
 */
public class Sheep implements Countable, Cloneable{
    int sheepCount;


    public void setSheep(String sheep) {
        this.sheep = sheep;
    }

    String sheep;

    @Override
    public void incrementCount() {
        sheepCount++;
    }

    @Override
    public void resetCount() {
        sheepCount=0;
    }

    @Override
    public int getCount() {
        return sheepCount;
    }

    @Override
    public String getCountString() {
        String message = getCount() + " " +  sheep;
        return message;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
