package adapter.pattern;

/**
 * Convert the interface of a class into another interface that clients expect.
 * The adapter pattern lets classes work together that couldn’t otherwise because of incompatible interfaces.
 */

public class AdapterPatternMain {
    public static void main(String [] args){
        System.out.println("*** Adapter Pattern Example ***");
        CalculatorAdapter calculatorAdapter = new CalculatorAdapter();
        Triangle triangle = new Triangle(20,10);
        System.out.println("Area of Triangle: " + calculatorAdapter.getArea(triangle));
        System.out.println("*** End Adapter Demo ***");
    }
}
