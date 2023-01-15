package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    public static void prime() {
        final var minNumber = 2;
        final var maxNumber = 100;

        String[][] questionsAndAnswers = new String[2][Engine.getRounds()];
        String taskDescription = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        for (var i = 0; i < Engine.getRounds(); i++) {
            var randomNum = Utils.randomGen(minNumber, maxNumber);
            questionsAndAnswers[0][i] = Integer.toString(randomNum);
            if (primeCheck(randomNum)) {
                questionsAndAnswers[1][i] = "yes";
            } else {
                questionsAndAnswers[1][i] = "no";
            }
        }
        Engine.engine(taskDescription, questionsAndAnswers);
    }

    public static boolean primeCheck(int input) {
        for (var i = 2; i <= input / 2; i++) {
            if (isDivisible(input, i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isDivisible(int input, int divisor) {
        return input % divisor == 0;
    }
}
