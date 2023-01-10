package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    public static void gcd() {
        final var minRandom = 2;
        final var maxRandom = 100;

        String[][] test = new String[2][Engine.getRounds()];
        String taskDescription = "Find the greatest common divisor of given numbers.";

        for (var i = 0; i < Engine.getRounds(); i++) {
            int random1 = Utils.randomGen(minRandom, maxRandom);
            int random2 = Utils.randomGen(minRandom, maxRandom);
            int gcd = gcdCalc(random1, random2);
            test[0][i] = random1 + " " + random2;
            test[1][i] = Integer.toString(gcd);
        }
        Engine.engine(taskDescription, test);
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
