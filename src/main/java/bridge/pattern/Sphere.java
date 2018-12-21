package bridge.pattern;

public class Sphere extends Shape {

    public Sphere(IColor c){
        super(c);
    }

    @Override
    void drawShape(int border) {
        System.out.println("This Sphere is colored with: ");
        color.fillWithColor(border);
    }

    @Override
    void modifyBorder(int border, int increment) {
        System.out.println("\nChange border length  " + increment + " times");
        border=border+increment++;
        drawShape(border);
    }

}
