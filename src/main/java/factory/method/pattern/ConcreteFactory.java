package factory.method.pattern;

public class ConcreteFactory extends IAnimalFactory {
    @Override
    public IAnimal GetAnimalType(String type) throws Exception {

//        switch (type) {
//            case "Duck":
//                return new Duck();
//            case "Tiger":
//                return new Tiger();
//            default:
//                throw new Exception("Animal type : " + type + " cannot be instantiated");
//        }
        if (type.equals("Duck")){
            return new Duck();
        }
         else if (type.equals("Tiger")){
            return new Tiger();
        }else {
            throw new Exception("Animal type : " + type + " cannot be instantiated");
        }
    }
}


