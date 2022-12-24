package hexlet.code.games;

import static hexlet.code.Engine.engine;

public class Calc {
    public static void calc() {
        int questionsCount = 3;
        String[] questions = new String[questionsCount];
        String[] answers = new String[questionsCount];
        int operand1 = 0, operand2 = 0, maxOperand1, maxOperand2;
        String operation = "";
        String taskDescription = "What is the result of the expression?";
        for (var i = 0; i < questionsCount; i++) {
            int operationCode = (int) (Math.random() * 3); /* 0 - Addition; 1 - Subtraction; 2 - Multiplication */
            switch (operationCode) {
                case 0:
                    operation = " + ";
                    maxOperand1 = 100;
                    maxOperand2 = 100;
                    operand1 = (int) (Math.random() * maxOperand1);
                    operand2 = (int) (Math.random() * maxOperand2);
                    answers[i] = Integer.toString(operand1 + operand2);
                    break;
                case 1:
                    operation = " - ";
                    maxOperand1 = 100;
                    maxOperand2 = 100;
                    operand1 = (int) (Math.random() * maxOperand1);
                    operand2 = (int) (Math.random() * maxOperand2);
                    answers[i] = Integer.toString(operand1 - operand2);
                    break;
                case 2:
                    operation = " * ";
                    maxOperand1 = 20;
                    maxOperand2 = 20;
                    operand1 = (int) (Math.random() * maxOperand1);
                    operand2 = (int) (Math.random() * maxOperand2);
                    answers[i] = Integer.toString(operand1 * operand2);
                    break;
            }
            questions[i] = Integer.toString(operand1) + operation + Integer.toString(operand2);
        }
        engine(taskDescription, questions, answers);
    }
}
