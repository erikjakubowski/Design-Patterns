package builder.pattern;

/**
 * Separate the construction of a complex object from its representation so
 * the same construction processes can create different representations.
 */

public class BuilderPatternMain {
    public static void main(String [] args){
        Director director = new Director();
        IBuilder carbuilder = new Car();
        IBuilder motorcycleBuilder = new Motorcycle();

        //Car
        director.Construct(carbuilder);
        Product product = carbuilder.GetVehicle();
        product.Show();

        //Motorcycle
        director.Construct(motorcycleBuilder);
        Product product1 = motorcycleBuilder.GetVehicle();
        product1.Show();
    }
}
