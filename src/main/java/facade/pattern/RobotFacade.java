package facade.pattern;

public class RobotFacade {
    RobotColor rc;
    RobotBody rb;
    RobotMetal rm;

    public RobotFacade(){
        rc = new RobotColor();
        rm = new RobotMetal();
        rb = new RobotBody();
    }
    public void BuildRobot(String color, String metal){
        System.out.println("\nStart up machines, time to build Robots");
        rc.setColor(color);
        rm.setMetal(metal);
        rb.CreateBody();
        System.out.println("Robot has been created\n");
    }
}
