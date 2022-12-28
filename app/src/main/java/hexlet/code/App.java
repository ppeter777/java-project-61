package hexlet.code;

import java.util.Scanner;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

public class App {
    public static void main(String[] args) {
        final var greeting = "1";
        final var even = "2";
        final var calc = "3";
        final var gcd = "4";
        final var progression = "5";
        final var prime = "6";
        final var exit = "0";

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit");
        System.out.print("Your choice: ");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.next();
        switch (choice) {
            case greeting -> Cli.greeting();
            case even -> Even.even();
            case calc -> Calc.calc();
            case gcd -> GCD.gcd();
            case progression -> Progression.progression();
            case prime -> Prime.prime();
            case exit -> {
            }
            default -> throw new IllegalStateException("Unexpected value: " + choice);
        }
    }
}


