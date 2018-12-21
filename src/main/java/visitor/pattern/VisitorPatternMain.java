package visitor.pattern;

/**
 *
 * Represent an operation to be performed on the elements of an object structure.
 * The visitor pattern lets you define a new operation without changing the classes of the elements on which it operates.
 *
 *
 */

public class VisitorPatternMain {
    public static void main(String[] args){
        System.out.println("****Start of Visitor Pattern*****");
        IVisitor v = new VisitorClass();
        PatternClass patternClass = new PatternClass();
        patternClass.acceptAVisitor(v);
    }
}
