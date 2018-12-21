package adapter.pattern;

public class CalculatorAdapter {
    Calculator calculator;
    Triangle triangle;

    public double getArea(Triangle t) {
        calculator = new Calculator();
        triangle = t;
        Rectangle rectangle = new Rectangle();
        rectangle.length = t.base;
        rectangle.width = 0.5 * t.height;
        return calculator.getArea(rectangle);
    }
}
