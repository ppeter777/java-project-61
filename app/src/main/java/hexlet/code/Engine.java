package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static final int ROUNDS = 3;
    public static void engine(String taskDescription, String[][] test) {
        System.out.println("\nWelcome to the Brain Games!");
        System.out.println("May I have your name?");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(taskDescription);
        for (var i = 0; i < ROUNDS; i++) {
            System.out.println("Question: " + test[0][i]);
            System.out.print("Your answer:  ");
            String input = scanner.next();
            if (input.equals(test[1][i])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + input + "' is wrong answer ;(. Correct answer was '" + test[1][i] + "'");
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
