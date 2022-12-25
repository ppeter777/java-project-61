package hexlet.code.games;

import static hexlet.code.Engine.engine;

public class Calc {
    public static void calc() {
        final var questionsCount = 3;
        final var maxRandomForAdditionAndSubtraction = 100;
        final var maxRandomForMultiplication = 20;
        final var operationsCount = 3;
        String[] questions = new String[questionsCount];
        String[] answers = new String[questionsCount];
        String taskDescription = "What is the result of the expression?";
        String[] operations = {" + ", " - ", " * "};
        for (var i = 0; i < questionsCount; i++) {
            int operationCode = (int) (Math.random() * operationsCount);
            int result = 0;
            int operand1 = (int) (Math.random() * maxRandomForAdditionAndSubtraction);
            int operand2 = (int) (Math.random() * maxRandomForAdditionAndSubtraction);
            if (operationCode == 0) {
                result = operand1 + operand2;
            } else if (operationCode == 1) {
                result = operand1 - operand2;
            } else if (operationCode == 2) {
                operand1 = (int) (Math.random() * maxRandomForMultiplication);
                operand2 = (int) (Math.random() * maxRandomForMultiplication);
                result = operand1 * operand2;
            }
            answers[i] = Integer.toString(result);
            questions[i] = operand1 + operations[operationCode] + operand2;
        }
        engine(taskDescription, questions, answers);
    }
}
