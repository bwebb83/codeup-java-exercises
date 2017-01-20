package roshambo;

import java.io.PrintStream;

/**
 * Created by Brian on 1/20/17.
 */
public class RockPaperScissors {
    public static void main(String[] bananas) {
        Console console = new Console();
        Player opponent = new RockPlayer("Rocky");;

        // Input
        String name = console.prompt("Enter your name");
        HumanPlayer humanPlayer = new HumanPlayer(name, console);
        String opponentName = console.prompt("Choose an opponent (Computer/Rocks)");

        if (opponentName.equalsIgnoreCase("Computer")) {
            opponent = new CPUPlayer("Turing");
        }

        play(humanPlayer, opponent);
    }

    private static void play(Player player, Player opponent) {
        PrintStream output = System.out;

        Roshambo choice = player.generateRoshambo();
        Roshambo opponentsChoice = opponent.generateRoshambo();

        // Process
        output.println(
                player.getName() + " choice was: " + choice + " "
                        + opponent.getName() + " choice was " + opponentsChoice
        );

        // Output
        if (choice.equals(opponentsChoice)) {
            output.println("It's a draw");
        } else if (choice.beats(opponentsChoice)) {
            output.println(player.getName() + " won!");
            player.win();
            opponent.lose();
        } else {
            output.println(player.getName() + " lost!");
            player.lose();
            opponent.win();
        }
        output.println(player.summary());
        output.println(opponent.summary());
    }
}
