package builder.pattern;

public class Car implements IBuilder{
    private Product product = new Product();

    public void BuildBody() {
        product.Add("This is the Vehicle Body");
    }

    public void InsertWheels() {
        product.Add("4 Wheels have been added");
    }

    public void AddHeadLights() {
        product.Add("Lets brighten it up with 2 HeadLights!");
    }

    public Product GetVehicle() {
        return product;
    }
}
