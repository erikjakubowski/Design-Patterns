package prototype.pattern;

/**
 *
 *
 * Specify the kinds of objects to create using a prototypical instance,
 * and create new objects by copying this prototype.
 *
 */

public class PrototypeMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("------ProtoType Example------");


        BasicCar nano_vehicle = new Nano("Nano with Nitro");
        nano_vehicle.price = 10_000;

        BasicCar chevy_vehicle = new Chevy("Chevy with Big Tires");
        chevy_vehicle.price = 50_000;

        BasicCar basicCar;


        basicCar = nano_vehicle.clone();
        basicCar.price = nano_vehicle.price + BasicCar.setPrice();
        System.out.println(String.format("Car is: %s and it’s price is Rs. %s", basicCar.modelName, basicCar.price));

        basicCar = chevy_vehicle.clone();
        basicCar.price = chevy_vehicle.price + BasicCar.setPrice();

        System.out.println(String.format("Car is: %s and it’s price is Rs. %s", basicCar.modelName, basicCar.price));

    }
}
