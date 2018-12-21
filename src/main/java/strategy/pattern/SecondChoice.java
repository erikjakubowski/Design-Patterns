package strategy.pattern;

public class SecondChoice implements IChoice {
    public void myChoice(String st1, String st2) {
        System.out.println("*** Second Choice Impl ***");
        System.out.println("You wanted to concatenate: " + st1 + st2);
        System.out.println("*** End Second Strategy ***");
    }
}
