package hexlet.code.games;

import static hexlet.code.Engine.engine;

public class Progression {
    public static void progression() {

        var questionsCount = 3;
        var minNumbersInProgression = 5;
        var variableNumbersInProgression = 5;
        var maxFirst = 20;
        var minStep = 2;
        var varStep = 5;

        String[] questions = new String[questionsCount];
        String[] answers = new String[questionsCount];
        String taskDescription = "What number is missing in the progression?";
        for (var i = 0; i < questionsCount; i++) {
            int progressionStep = (int) (Math.random() * varStep) + minStep;
            int firstElement = (int) (Math.random() * maxFirst) + 1;
            int elements = (int) (Math.random() * variableNumbersInProgression) + minNumbersInProgression;
            int missingElement = (int) (Math.random() * elements);
            int[] progression = generateProgression(elements, firstElement, progressionStep);
            questions[i] = generateQuestion(progression, missingElement);
            answers[i] = Integer.toString(progression[missingElement]);
        }
        engine(taskDescription, questions, answers);
    }
    public static int[] generateProgression(int elements, int first, int step) {
        int[] output = new int[elements];
        for (var n = 0; n < elements; n++) {
            output[n] = first + n * step;
        }
        return output;
    }
    public static String generateQuestion(int[] progression, int missingElement) {
        String question = new String();
        for (var m = 0; m < progression.length; m++) {
            if (m != missingElement) {
                question += Integer.toString(progression[m]) + " ";
            } else {
                question += ".. ";
            }
        }
        return question;
    }
}
