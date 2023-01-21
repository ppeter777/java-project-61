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

        String[][] questionsAndAnswers = new String[Engine.getRounds()][2];
        String taskDescription = "What number is missing in the progression?";
        for (var i = 0; i < Engine.getRounds(); i++) {
            int progressionStep = Utils.randomGen(minStep, maxStep);
            int firstElement = Utils.randomGen(minFirstElement, maxFirstElement);
            int elementsInProgression = Utils.randomGen(minElements, maxElements);
            int missingElement = Utils.randomGen(0, elementsInProgression - 1);
            String[] progression = progressionGen(elementsInProgression, firstElement, progressionStep);
            questionsAndAnswers[i][1] = progression[missingElement];
            progression[missingElement] = "..";
            questionsAndAnswers[i][0] = String.join(" ", progression);
        }
        Engine.engine(taskDescription, questionsAndAnswers);
    }

    public static String[] progressionGen(int elements, int first, int step) {
        String[] progression = new String[elements];
        for (var m = 0; m < elements; m++) {
            progression[m] = Integer.toString(first + m * step);
        }
        return progression;
    }
}
