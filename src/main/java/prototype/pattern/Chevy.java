package prototype.pattern;

public class Chevy extends BasicCar {

    public Chevy(String name){
        modelName = name;
    }

    @Override
    public BasicCar clone() throws CloneNotSupportedException {
        return (Chevy)super.clone();
    }
}
