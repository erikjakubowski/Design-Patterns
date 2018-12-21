package factory.method.pattern;

public abstract class IAnimalFactory {
    public abstract IAnimal GetAnimalType(String type) throws Exception;

}
