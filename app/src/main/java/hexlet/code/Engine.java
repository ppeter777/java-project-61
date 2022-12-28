package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static int rounds = 3;
    public static void engine(String taskDescription, String[] questions, String[] answers) {
        final var questionsCount = 3;

        Scanner scanner = new Scanner(System.in);
        String user = Cli.greeting();
        System.out.println(taskDescription);
        for (var i = 0; i < rounds; i++) {
            System.out.println("Question: " + questions[i]);
            System.out.print("Your answer:  ");
            String input = scanner.next();
            if (input.equals(answers[i])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + input + "' is wrong answer ;(. Correct answer was '" + answers[i] + "'");
                System.out.println("Let's try again, " + user + "!");
                scanner.close();
                return;
            }
        }
        System.out.println("Congratulations, " + user + "!");
    }
    public static int getRounds() {
        return rounds;
    }
}
