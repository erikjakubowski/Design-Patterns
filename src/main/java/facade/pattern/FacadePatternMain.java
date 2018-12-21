package facade.pattern;

/**
 * Provide a unified interface to a set of interfaces in a system.
 * Facade defines a higher-level interface that makes the subsystem easier to use.
 */

public class FacadePatternMain {
    public static void main(String[]args){
        System.out.println("*** Facade Demo ***");
        RobotFacade robotFacade = new RobotFacade();
        robotFacade.BuildRobot("Silver", "Aluminum");
        robotFacade.BuildRobot("Brown", "Bronze");
    }
}
