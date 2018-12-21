package bridge.pattern;

public class Triangle extends Shape {

    protected Triangle(IColor c){
        super(c);
    }

    @Override
    void drawShape(int border) {
        System.out.println("This triangle is colored with: ");
        color.fillWithColor(border);
    }

    @Override
    void modifyBorder(int border, int increment) {
        System.out.println("\nChange border length  " + increment + " times");
        border=border+increment++;
        drawShape(border);
    }


}
