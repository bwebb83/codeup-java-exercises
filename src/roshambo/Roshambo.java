package roshambo;

/**
 * Created by Brian on 1/20/17.
 */
public enum Roshambo {
    PAPER(1), SCISSORS(2), ROCK(0);

    private int beatenBy;

    Roshambo(int beatenBy) {
        this.beatenBy = beatenBy;
    }

    public boolean beats(Roshambo opponentsChoice) {
        return opponentsChoice.ordinal() != beatenBy;
    }
}
