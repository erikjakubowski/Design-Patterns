package visitor.pattern;

public class VisitorClass implements IVisitor{
    @Override
    public void visit(PatternClass patternClass) {
        System.out.println("Visitor impl to change int value");
        patternClass.setPatternInt(100);
        System.out.println("\nExisting Visitor");
    }
}
