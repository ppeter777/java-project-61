package hexlet.code;

import java.util.Scanner;

import static hexlet.code.Cli.greeting;

public class Engine {
    public static void engine(String taskDescription, String[] questions, String[] answers) {
        var questionsCount = 3;

        Scanner scanner = new Scanner(System.in);
        String user = greeting();
        System.out.println(taskDescription);
        for (var i = 0; i < questionsCount; i++) {
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
}
