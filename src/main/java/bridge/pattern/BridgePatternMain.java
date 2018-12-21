package bridge.pattern;

/**
 *
 * Decouple an abstraction from its implementation so that the two can vary independently.
 *
 */

public class BridgePatternMain {
    public static void main(String [] args){
        System.out.println("****Bridge Pattern*****");

        System.out.println("\n Coloring Triangle:");
        IColor blue = new Blue();
        Shape triangleShape = new Triangle(blue);


        triangleShape.drawShape(10);
        triangleShape.modifyBorder(10,1);

        System.out.println("\n\nColoring Sphere :");
        IColor red = new Red();
        Shape rectangleShape = new Sphere(red);


        rectangleShape.drawShape(5);
        rectangleShape.modifyBorder(5,2);


    }
}
