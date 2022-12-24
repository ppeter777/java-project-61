package hexlet.code.games;

import static hexlet.code.Engine.engine;

public class GCD {
    public static void gcd() {
        int questionsCount = 3;
        String[] questions = new String[questionsCount];
        String[] answers = new String[questionsCount];
        String taskDescription = "Find the greatest common divisor of given numbers.";
        for (var i = 0; i < questionsCount; i++) {
            var randomNum1 = (int) Math.ceil(Math.random() * 100);
            var randomNum2 = (int) Math.ceil(Math.random() * 100);
            int maxGCD = Math.min(randomNum1, randomNum2);
            int gcd = 1;
            for (var n = 1; n <= maxGCD; n++) {
                if ((randomNum1 % n) == 0 && (randomNum2 % n) == 0) {
                    gcd = n;
                }
            }
            questions[i] = Integer.toString(randomNum1) + " " + Integer.toString(randomNum2);
            answers[i] = Integer.toString(gcd);
        }
        engine(taskDescription, questions, answers);
    }
}