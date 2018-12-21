package interpreter.pattern;

import java.util.Scanner;

/**
 * Given a language,
 * define a representation for its grammar along with an interpreter that uses the representation to interpret sentences in the language.
 */

public class InterpreterPatternMain {

    public Context clientContext = null;
    public IExpression exp = null;

    public InterpreterPatternMain(Context c) {
        clientContext = c;
    }

    public void interpret(String str) {


        for (int i = 0; i < 3; i++) {
            System.out.println("\nEnter your choice of 1 or 2");
            Scanner in = new Scanner(System.in);
            String string = in.nextLine();

            if ("1".equals(string)) {
                exp = new IntToWords(str);
                exp.interpret(clientContext);

            } else {
                exp = new StringToBinary(str);
                exp.interpret(clientContext);

            }

        }

    }

    public static void main(String[] args) {

        System.out.println("\n***Interpreter Pattern Demo***\n");
        System.out.println("Enter a number :");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        Context context = new Context(input);
        InterpreterPatternMain client = new InterpreterPatternMain(context);
        client.interpret(input);

    }
}
