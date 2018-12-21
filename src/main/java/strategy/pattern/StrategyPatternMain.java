package strategy.pattern;

import java.util.Scanner;

/**
 *
 * Define a family of algorithms, encapsulate each one, and make them interchangeable.
 * The strategy pattern lets the algorithm vary independently from client to client.
 *
 */

public class StrategyPatternMain {
    public static void main(String[] args) {
        System.out.println("*** Start Math Problem ***");
        IChoice ic = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick any number: ");
        String str1 = scanner.next();
        System.out.println("Pick another number: ");
        String str2 = scanner.next();
        System.out.println("Enter 1 for addition, Enter 2 for concatenation: ");
        String c = scanner.next();
        if (c.equals("1") || c.equals("2")) {
            if (c.equals("1")) {
                ic = new FirstChoice();
                Context context = new Context();
                context.SetChoice(ic);
                context.ShowChoice(str1, str2);
                scanner.close();
            } else {
                ic = new SecondChoice();
                Context context = new Context();
                context.SetChoice(ic);
                context.ShowChoice(str1, str2);
                scanner.close();
            }
        } else {
            System.out.println("Error, no strategy picked.");
            scanner.close();
        }
    }
}
