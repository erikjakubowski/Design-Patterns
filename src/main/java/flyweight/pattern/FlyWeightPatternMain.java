package flyweight.pattern;

import java.util.Random;

/**
 *
 * Flyweight Pattern
 *
 * Use sharing to support large numbers of fine-grained objects efficiently
 *
 */

public class FlyWeightPatternMain {

    static String getRandomType()
    {
        Random r=new Random();
        int random=r.nextInt(10);
        if(random%2==0)
        {
            return "from minds of Silicon Valley.";
        }
        else
        {
            return "from the warehouse of SpaceX.";
        }
    }


    public static void main(String[] args) throws Exception{

        RobotFactory robotFactory = new RobotFactory();

        System.out.println("--------Turn on the Robot factory--------");

        Robot shape;

        /**
         * Create multiples to differ it from Singleton
         */
        for(int i = 0; i < 3; i++){

            shape =(Robot) robotFactory.GetRobotFactory("Hero");
            shape.setColorOfRobot(getRandomType());
            shape.Print();

        }
        for(int i = 0; i < 3; i++){

            shape =(Robot) robotFactory.GetRobotFactory("Evil");
            shape.setColorOfRobot(getRandomType());
            shape.Print();

        }

        int NumOfDistinctRobots = robotFactory.TotalObjectsCreated();
        System.out.println("\n Final number of Distinct Robot objects created: "+ NumOfDistinctRobots);

    }
}
