package roshambo;

/**
 * Created by Brian on 1/20/17.
 */
public class RockPlayer extends Player {
    public RockPlayer(String name) {
        super(name);
    }
    public Roshambo generateRoshambo() {
        return Roshambo.ROCK;
    }
}
