package flyweight.pattern;

import java.util.HashMap;
import java.util.Map;

public class RobotFactory {

    Map<String, IRobot> shapes = new HashMap<String, IRobot>();

    public int TotalObjectsCreated() {
        return shapes.size();
    }

    public IRobot GetRobotFactory(String robotType) throws Exception {

        IRobot robotCategory = null;

        if (shapes.containsKey(robotType)) {
            robotCategory = shapes.get(robotType);
        } else {
            switch (robotType)
            {
                case "Evil":
                    System.out.println("\nWe do not want evil Robots. But they are coming to life now.\n");
                    robotCategory = new Robot("Evil");
                    shapes.put("Evil",robotCategory);
                    break;
                case "Hero":
                    System.out.println("\nWe need Hero Robots. So we are building our savor now.\n");
                    robotCategory = new Robot("Hero");
                    shapes.put("Hero",robotCategory);
                    break;
                default:
                    throw new Exception(" \nRobot Factory can create only evil and hero type robots\n");
            }
        }

        return robotCategory;


    }

}
