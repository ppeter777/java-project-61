package hexlet.code.games;

import static hexlet.code.Engine.engine;
public class Even {
    public static void even() {
        int questionsCount = 3;
        String[] questions = new String[questionsCount];
        String[] answers = new String[questionsCount];
        String taskDescription = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        for (var i = 0; i < questionsCount; i++) {
            var randomNum = (int) (Math.random() * 100);
            questions[i] = Integer.toString(randomNum);
            if (randomNum % 2 == 0) {
                answers[i] = "yes";
            } else {
                answers[i] = "no";
            }
        }
        engine(taskDescription, questions, answers);
    }
}
