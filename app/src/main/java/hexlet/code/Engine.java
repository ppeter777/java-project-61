package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static final int ROUNDS = 3;
    public static void engine(String taskDescription, String[][] questionsAndAnswers) {
        System.out.println("\nWelcome to the Brain Games!");
        System.out.println("May I have your name?");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(taskDescription);
        for (var i = 0; i < ROUNDS; i++) {
            System.out.println("Question: " + questionsAndAnswers[i][0]);
            System.out.print("Your answer:  ");
            String input = scanner.next();
            if (input.equals(questionsAndAnswers[i][1])) {
                System.out.println("Correct!");
            } else {
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'%n", input, questionsAndAnswers[i][1]);
                System.out.println("Let's try again, " + userName + "!");
                scanner.close();
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }

    public static int getRounds() {
        return ROUNDS;
    }
}
