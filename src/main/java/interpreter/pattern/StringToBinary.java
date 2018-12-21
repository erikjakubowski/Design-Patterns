package interpreter.pattern;

public class StringToBinary implements IExpression{

    private String str;

    public StringToBinary(String s) {
        this.str = s;
    }

    @Override
    public void interpret(Context c) {
        c.getBinaryForm(str);
    }


}
