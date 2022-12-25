package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    public static void progression() {
        final var questionsCount = 3;
        final var minElements = 5;
        final var maxElements = 10;
        final var maxFirstElement = 20;
        final var minStep = 5;
        final var maxStep = 12;

        String[] questions = new String[questionsCount];
        String[] answers = new String[questionsCount];
        String taskDescription = "What number is missing in the progression?";

        for (var i = 0; i < questionsCount; i++) {
            int progressionStep = (int) (Math.random() * (maxStep - minStep + 1)) + minStep;
            int firstElement = (int) (Math.random() * maxFirstElement) + 1;
            int elements = (int) (Math.random() * (maxElements - minElements + 1)) + minElements;
            int missingElement = (int) (Math.random() * elements);
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
