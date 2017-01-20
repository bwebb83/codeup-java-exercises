package roshambo;

import java.util.Random;

/**
 * Created by Brian on 1/18/17.
 */
public class CPUPlayer extends Player {

        CPUPlayer(String name) {
            super(name);
        }

        @Override
        public Roshambo generateRoshambo() {
            Random random = new Random();
            int number = random.nextInt(3);

            return Roshambo.values()[number];
        }
    }

