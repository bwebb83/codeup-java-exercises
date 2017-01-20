package roshambo;

/**
 * Created by Brian on 1/20/17.
 */
public class HumanPlayer extends Player {
    private Console console;

    public HumanPlayer(String name, Console console) {
        super(name);
        this.console = console;
    }

    public Roshambo generateRoshambo() { //signature
        String choice = console.prompt("Choose Rock, Paper, Scissors");
        return Roshambo.valueOf(choice.toUpperCase());
    }
}