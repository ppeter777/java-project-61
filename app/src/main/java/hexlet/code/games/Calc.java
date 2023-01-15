package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    public static void calc() {
        final var minRandom = 1;
        final var maxRandom = 50;

        String[][] questionsAndAnswers = new String[2][Engine.getRounds()];
        String taskDescription = "What is the result of the expression?";
        String[] operations = {" + ", " - ", " * "};
        int operationsCount = operations.length;

        for (var i = 0; i < Engine.getRounds(); i++) {
            int operationCode = Utils.randomGen(0, operationsCount - 1);
            int result = 0;
            int operand1 = Utils.randomGen(minRandom, maxRandom);
            int operand2 = Utils.randomGen(minRandom, maxRandom);
            if (operationCode == 0) {
                result = operand1 + operand2;
            } else if (operationCode == 1) {
                result = operand1 - operand2;
            } else if (operationCode == 2) {
                result = operand1 * operand2;
            }
            questionsAndAnswers[0][i] = operand1 + operations[operationCode] + operand2;
            questionsAndAnswers[1][i] = Integer.toString(result);
        }
        Engine.engine(taskDescription, questionsAndAnswers);
    }
}
