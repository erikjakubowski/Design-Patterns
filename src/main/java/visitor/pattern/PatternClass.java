package visitor.pattern;

public class PatternClass implements IOriginal {

    private int patternInt = 5;

    public int getPatternInt() {
        return patternInt;
    }

    public void setPatternInt(int patternInt) {
        this.patternInt = patternInt;
    }

    @Override
    public void acceptAVisitor(IVisitor visitor) {
        System.out.println("Original int value is : " + patternInt);
        visitor.visit(this);
        System.out.println("\nVisiting change int value to : " + patternInt);
    }
}
