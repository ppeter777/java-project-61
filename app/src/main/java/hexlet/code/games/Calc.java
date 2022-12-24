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
        int operand1 = 0;
        int operand2 = 0;
        String operation = "";
        String taskDescription = "What is the result of the expression?";
        for (var i = 0; i < questionsCount; i++) {
            int operationCode = (int) (Math.random() * operationsCount);
            switch (operationCode) {
                case 0:
                    operation = " + ";
                    operand1 = (int) (Math.random() * maxRandomForAdditionAndSubtraction);
                    operand2 = (int) (Math.random() * maxRandomForAdditionAndSubtraction);
                    answers[i] = Integer.toString(operand1 + operand2);
                    break;
                case 1:
                    operation = " - ";
                    operand1 = (int) (Math.random() * maxRandomForAdditionAndSubtraction);
                    operand2 = (int) (Math.random() * maxRandomForAdditionAndSubtraction);
                    answers[i] = Integer.toString(operand1 - operand2);
                    break;
                case 2:
                    operation = " * ";
                    operand1 = (int) (Math.random() * maxRandomForMultiplication);
                    operand2 = (int) (Math.random() * maxRandomForMultiplication);
                    answers[i] = Integer.toString(operand1 * operand2);
                    break;
                default:
            }
            questions[i] = Integer.toString(operand1) + operation + Integer.toString(operand2);
        }
        engine(taskDescription, questions, answers);
    }
}
