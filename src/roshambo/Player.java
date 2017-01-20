package roshambo;

/**
 * Created by Brian on 1/20/17.
 */
abstract public class Player {
    private String name;
    private int winsCounter = 0;
    private int lossCounter = 0;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String summary() {
        return name + " has won " + winsCounter + " times"
                + " and has lost " + lossCounter + " times.";
    }

    public void lose() {
        lossCounter++;
    }

    public void win() {
        winsCounter++;
    }

    abstract public Roshambo generateRoshambo();
}