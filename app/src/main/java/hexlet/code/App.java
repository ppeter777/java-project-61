package hexlet.code;

import java.util.Scanner;

import static hexlet.code.Cli.greeting;
import static hexlet.code.games.Even.even;
import static hexlet.code.games.Calc.calc;
import static hexlet.code.games.GCD.gcd;
import static hexlet.code.games.Progression.progression;
import static hexlet.code.games.Prime.prime;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.next();
        if (choice.equals("1")) {
            greeting();
        } else if (choice.equals("2")) {
            even();
        } else if (choice.equals("3")) {
            calc();
        } else if (choice.equals("4")) {
            gcd();
        } else if (choice.equals("5")) {
            progression();
        } else if (choice.equals("6")) {
            prime();
        }
    }
}

