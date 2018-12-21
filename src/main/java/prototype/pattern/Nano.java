package prototype.pattern;

public class Nano extends BasicCar {

    public Nano(String name){
        modelName = name;
    }

    @Override
    public BasicCar clone() throws CloneNotSupportedException {
        return (Nano)super.clone();
    }

}
