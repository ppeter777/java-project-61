package hexlet.code;

import hexlet.code.games.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit");
        System.out.print("Your choice: ");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.next();
        switch (choice) {
            case "2" -> Even.even();
            case "3" -> Calc.calc();
            case "4" -> GCD.gcd();
            case "5" -> Progression.progression();
            case "6" -> Prime.prime();
            default -> Cli.greeting();
        }
    }
}


