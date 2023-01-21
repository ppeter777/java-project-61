package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    public static void even() {
        final var minRandom = 1;
        final var maxRandom = 100;

        String[][] questionsAndAnswers = new String[Engine.getRounds()][2];
        String taskDescription = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        for (var i = 0; i < Engine.getRounds(); i++) {
            int randomNum = Utils.randomGen(minRandom, maxRandom);
            questionsAndAnswers[i][0] = Integer.toString(randomNum);
            questionsAndAnswers[i][1] = isEven(randomNum) ? "yes" : "no";
        }
        Engine.engine(taskDescription, questionsAndAnswers);
    }

    public static boolean isEven(int input) {
        return input % 2 == 0;
    }
}
