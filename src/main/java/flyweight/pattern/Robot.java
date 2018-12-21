package flyweight.pattern;

public class Robot implements IRobot {

    String robotType;
    public String colorOfRobot;

    public void Print() {
        System.out.print(String.format("\nThis is a %s type of robot %s\n", robotType, colorOfRobot));
    }

    public Robot(String robotType) {
        this.robotType = robotType;
    }

    public String getRobotType() {
        return robotType;
    }

    public void setRobotType(String robotType) {
        this.robotType = robotType;
    }

    public String getColorOfRobot() {
        return colorOfRobot;
    }

    public void setColorOfRobot(String colorOfRobot) {
        this.colorOfRobot = colorOfRobot;
    }
}
