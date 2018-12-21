package builder.pattern;

public class Motorcycle implements IBuilder {
    private Product product = new Product();

    public void BuildBody() {
        product.Add("Build Motorcycle frame");
    }

    public void AddHeadLights() {
        product.Add("Adding 1 headlight to the bike");
    }

    public void InsertWheels() {
        product.Add("Only needs two wheels to go fast!");
    }

    public Product GetVehicle() {
        return product;
    }
}
