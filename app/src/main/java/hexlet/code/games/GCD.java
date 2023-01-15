package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    public static void gcd() {
        final var minRandom = 2;
        final var maxRandom = 100;

        String[][] questionsAndAnswers = new String[Engine.getRounds()][2];
        String taskDescription = "Find the greatest common divisor of given numbers.";
        for (var i = 0; i < Engine.getRounds(); i++) {
            int random1 = Utils.randomGen(minRandom, maxRandom);
            int random2 = Utils.randomGen(minRandom, maxRandom);
            int gcd = gcdCalc(random1, random2);
            questionsAndAnswers[i][0] = random1 + " " + random2;
            questionsAndAnswers[i][1] = Integer.toString(gcd);
        }
        Engine.engine(taskDescription, questionsAndAnswers);
    }

    public static int gcdCalc(int random1, int random2) {
        int gcd = 1;
        for (var n = 1; n <= Math.min(random1, random2); n++) {
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
