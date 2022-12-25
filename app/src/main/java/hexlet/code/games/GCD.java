package hexlet.code.games;

import static hexlet.code.Engine.engine;

public class GCD {
    public static void gcd() {
        final var questionsCount = 3;
        final var maxRandom = 100;

        String[] questions = new String[questionsCount];
        String[] answers = new String[questionsCount];
        String taskDescription = "Find the greatest common divisor of given numbers.";
        for (var i = 0; i < questionsCount; i++) {
            int random1 = (int) (Math.random() * maxRandom) + 1;
            int random2 = (int) (Math.random() * maxRandom) + 1;
            int maxGCD = Math.min(random1, random2);
            int gcd = gcdCalc(maxGCD, random1, random2);
            questions[i] = random1 + " " + random2;
            answers[i] = Integer.toString(gcd);
        }
        engine(taskDescription, questions, answers);
    }
    public static int gcdCalc(int maxGCD, int random1, int random2) {
        int gcd = 1;
        for (var n = 1; n <= maxGCD; n++) {
            if (random1 % n == 0 && random2 % n == 0) {
                gcd = n;
            }
        }
        return gcd;
    }
}
