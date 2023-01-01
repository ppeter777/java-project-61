package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    public static void gcd() {
        final var minRandom = 2;
        final var maxRandom = 100;

        String[] questions = new String[Engine.getRounds()];
        String[] answers = new String[Engine.getRounds()];
        String taskDescription = "Find the greatest common divisor of given numbers.";

        for (var i = 0; i < Engine.getRounds(); i++) {
            int random1 = Utils.randomGen(minRandom, maxRandom);
            int random2 = Utils.randomGen(minRandom, maxRandom);
            int maxGCD = Math.min(random1, random2);
            int gcd = gcdCalc(maxGCD, random1, random2);
            questions[i] = random1 + " " + random2;
            answers[i] = Integer.toString(gcd);
        }
        Engine.engine(taskDescription, questions, answers);
    }
    public static int gcdCalc(int maxGCD, int random1, int random2) {
        int gcd = 1;
        for (var n = 1; n <= maxGCD; n++) {
            if (isDivisible(random1, n) && isDivisible(random2, n)) {
                gcd = n;
            }
        }
        return gcd;
    }
    public static boolean isDivisible(int input, int divisor) {
        return input % divisor == 0;
    }
}
