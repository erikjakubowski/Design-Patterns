package interpreter.pattern;

public class Context {

    private String input;

    public Context(String input) {
        this.input = input;
    }

    public void getBinaryForm(String input) {

        int i = Integer.parseInt(input);
        String binaryString = Integer.toBinaryString(i);
        System.out.println("Binary equivant of " + input + " is " + binaryString);

    }

    public void printWords(String input) {

        this.input = input;
        System.out.println("Lets print the inputs as words: ");
        char[] c = input.toCharArray();

        for (char ch : c) {

            switch (ch) {

                case '1':
                    System.out.println("One");
                    break;

                case '2':
                    System.out.println("Two");
                    break;

                case '3':
                    System.out.println("Three");
                    break;

                case '4':
                    System.out.println("Four");
                    break;

                case '5':
                    System.out.println("Five");
                    break;

                case '6':
                    System.out.println("Six");
                    break;

                case '7':
                    System.out.println("Seven");
                    break;

                case '8':
                    System.out.println("Eight");
                    break;

                default:
                    System.out.println("* ");
                    break;
            }


        }

    }
}
