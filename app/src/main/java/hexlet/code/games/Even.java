package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    public static void even() {
        final var minRandom = 1;
        final var maxRandom = 100;

        String[] questions = new String[Engine.getRounds()];
        String[] answers = new String[Engine.getRounds()];
        String taskDescription = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        for (var i = 0; i < Engine.getRounds(); i++) {
            int randomNum = Utils.randomGen(minRandom, maxRandom);
            questions[i] = Integer.toString(randomNum);
            if (isEven(randomNum)) {
                answers[i] = "yes";
            } else {
                answers[i] = "no";
            }
        }
        Engine.engine(taskDescription, questions, answers);
    }
    public static boolean isEven(int input) {
        return input % 2 == 0;
    }
}
