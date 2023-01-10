package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    public static void even() {
        final var minRandom = 1;
        final var maxRandom = 100;
        String[][] test = new String[2][Engine.getRounds()];
        String taskDescription = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        for (var i = 0; i < Engine.getRounds(); i++) {
            int randomNum = Utils.randomGen(minRandom, maxRandom);
            test[0][i] = Integer.toString(randomNum);
            if (isEven(randomNum)) {
                test[1][i] = "yes";
            } else {
                test[1][i] = "no";
            }
        }
        Engine.engine(taskDescription, test);
    }
    public static boolean isEven(int input) {
        return input % 2 == 0;
    }
}
