package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    public static void even() {
        final var questionsCount = 3;
        final var maxRandom = 100;

        String[] questions = new String[questionsCount];
        String[] answers = new String[questionsCount];
        String taskDescription = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        for (var i = 0; i < questionsCount; i++) {
            int randomNum = (int) (Math.random() * maxRandom) + 1;
            questions[i] = Integer.toString(randomNum);
            if (randomNum % 2 == 0) {
                answers[i] = "yes";
            } else {
                answers[i] = "no";
            }
        }
        Engine.engine(taskDescription, questions, answers);
    }
}
