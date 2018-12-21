package interpreter.pattern;

public class IntToWords implements IExpression {


    private String str;

    public IntToWords(String str) {
        this.str = str;
    }

    @Override
    public void interpret(Context c) {
        c.printWords(str);
    }

}
