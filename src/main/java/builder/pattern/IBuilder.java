package builder.pattern;

public interface IBuilder {
    void BuildBody();
    void InsertWheels();
    void AddHeadLights();
    Product GetVehicle();
}
