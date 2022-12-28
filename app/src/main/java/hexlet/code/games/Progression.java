package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    public static void progression() {
        final var minElements = 5;
        final var maxElements = 10;
        final var minFirstElement = 1;
        final var maxFirstElement = 20;
        final var minStep = 5;
        final var maxStep = 12;

        String[] questions = new String[Engine.getRounds()];
        String[] answers = new String[Engine.getRounds()];
        String taskDescription = "What number is missing in the progression?";

        for (var i = 0; i < Engine.getRounds(); i++) {
            int progressionStep = Utils.randomGen(minStep, maxStep);
            int firstElement = Utils.randomGen(minFirstElement, maxFirstElement);
            int elements = Utils.randomGen(minElements, maxElements);
            int missingElement = Utils.randomGen(0, elements - 1);
            int[] progression = generateProgression(elements, firstElement, progressionStep);
            questions[i] = generateQuestion(progression, missingElement);
            answers[i] = Integer.toString(progression[missingElement]);
        }
        Engine.engine(taskDescription, questions, answers);
    }
    public static int[] generateProgression(int elements, int first, int step) {
        int[] output = new int[elements];
        for (var n = 0; n < elements; n++) {
            output[n] = first + n * step;
        }
        return output;
    }
    public static String generateQuestion(int[] progression, int missingElement) {
        var result = new StringBuilder();
        for (var m = 0; m < progression.length; m++) {
            if (m != missingElement) {
                result.append(progression[m]);
                result.append(" ");
            } else {
                result.append(".. ");
            }
        }
        return result.toString();
    }
}
