package hexlet.code.games;

import static hexlet.code.Engine.engine;

public class Progression {
    public static void progression() {
        int questionsCount = 3;
        String[] questions = new String[questionsCount];
        String[] answers = new String[questionsCount];
        String taskDescription = "What number is missing in the progression?";
        for (var i = 0; i < questionsCount; i++) {
            int progressionStep = (int) (Math.random() * 5) + 2; /* Progression step is in range 2..6 */
            int firstElement = (int) (Math.random() * 20) + 1; /* First element is in range 1..20 */
            int elements = (int) (Math.random() * 5) + 5; /* The number of elements in progression is in range 5..10 */
            int missingElement = (int) (Math.random() * elements); /* Define the position of missing element */
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
            } else { question += ".. ";
            }
        }
        return question;
    }
}
