package facade.pattern;

public class RobotColor {
    private String color;

    public void setColor(String color) {
        this.color = color;
        System.out.println("Set the color to: " + this.color);
    }
}
