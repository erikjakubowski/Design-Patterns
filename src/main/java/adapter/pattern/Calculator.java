package adapter.pattern;

public class Calculator {
    Rectangle rectangle;

    public double getArea(Rectangle r) {
        rectangle = r;
        return rectangle.length * rectangle.width;

    }
}
