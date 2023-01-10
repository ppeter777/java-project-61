package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static final int ROUNDS = 3;
    public static void engine(String taskDescription, String[][] test) {
        Scanner scanner = new Scanner(System.in);
        String user = Cli.greeting();
        System.out.println(taskDescription);
        for (var i = 0; i < ROUNDS; i++) {
            System.out.println("Question: " + test[0][i]);
            System.out.print("Your answer:  ");
            String input = scanner.next();
            if (input.equals(test[1][i])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + input + "' is wrong answer ;(. Correct answer was '" + test[1][i] + "'");
                System.out.println("Let's try again, " + user + "!");
                scanner.close();
                return;
            }
        }
        System.out.println("Congratulations, " + user + "!");
    }
    public static int getRounds() {
        return ROUNDS;
    }
}
