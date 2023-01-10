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

        String[][] test = new String[2][Engine.getRounds()];
        String taskDescription = "What number is missing in the progression?";

        for (var i = 0; i < Engine.getRounds(); i++) {
            int progressionStep = Utils.randomGen(minStep, maxStep);
            int firstElement = Utils.randomGen(minFirstElement, maxFirstElement);
            int elements = Utils.randomGen(minElements, maxElements);
            int missingElement = Utils.randomGen(0, elements - 1);
            String[] progression = progressionGen(elements, firstElement, progressionStep);
            test[1][i] = progression[missingElement];
            progression[missingElement] = "..";
            test[0][i] = String.join(" ", progression);
        }
        Engine.engine(taskDescription, test);
    }
    public static String[] progressionGen(int elements, int first, int step) {
        String[] progression = new String[elements];
        for (var m = 0; m < elements; m++) {
            progression[m] = Integer.toString(first + m * step);
        }
        return progression;
    }
}
