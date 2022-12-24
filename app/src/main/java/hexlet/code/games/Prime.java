package hexlet.code.games;

import static hexlet.code.Engine.engine;

public class Prime {
    public static void prime() {
        int questionsCount = 3;
        String[] questions = new String[questionsCount];
        String[] answers = new String[questionsCount];
        String taskDescription = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        for (var i = 0; i < questionsCount; i++) {
            var randomNum = (int) (Math.random() * 99) + 2; /* Number is in range 2..100 */
            questions[i] = Integer.toString(randomNum);
            answers[i] = primeCheck(randomNum);
        }
        engine(taskDescription, questions, answers);
    }
    public static String primeCheck(int input) {
        String output = "yes";
        for (var i = 2; i < input / 2; i++) {
            if (input % i == 0) {
                output = "no";
            }
        }
        return output;
    }
}