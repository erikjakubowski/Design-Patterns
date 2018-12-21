package strategy.pattern;

public class FirstChoice implements IChoice {

    public void myChoice(String st1, String st2) {
        System.out.println("*** Choice One is to add the numbers ***");
        int i, j, sum;
        i = Integer.parseInt(st1);
        j = Integer.parseInt(st2);
        sum = i + j;
        System.out.println("This is the result of summation " + sum);
        System.out.println("*** End First Strategy ***");
    }
}
