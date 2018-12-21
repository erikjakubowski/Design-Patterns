package factory.method.pattern;

/**
 * Define an interface for creating an object, but let subclasses decide which class to instantiate.
 * The factory method lets a class defer instantiation to subclasses.
 */

public class FactoryPatternMain {
    public static void main(String[] args) throws Exception
    {
        System.out.println("***Factory Pattern Demo***\n");

        IAnimalFactory animalFactory = new ConcreteFactory();
        IAnimal DuckType=animalFactory.GetAnimalType("Duck");
        DuckType.Speak();

        IAnimal TigerType = animalFactory.GetAnimalType("Tiger");
        TigerType.Speak();

    }
}
