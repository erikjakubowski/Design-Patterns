package template.pattern;

/**
 * Define the skeleton of an algorithm in an operation, deferring some steps to subclasses.
 * The template method lets subclasses redefine certain steps of an algorithm without changing the algorithm’s structure
 */

public class TemplatePatternMain {
    public static void main(String[]args){
        System.out.println("**** Template Pattern Example ****");
        System.out.println("\n*** Computer Science Template ***");
        BasicEngineering bscs = new ComputerScience();
        bscs.Papers();
        System.out.println("\n*** Electronics Template ***");
        BasicEngineering bse = new Electronics();
        bse.Papers();
    }
}
