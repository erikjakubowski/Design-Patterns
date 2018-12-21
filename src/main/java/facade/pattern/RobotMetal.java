package facade.pattern;

public class RobotMetal {
    private String metal;

    public void setMetal(String metal) {
        this.metal = metal;
        System.out.println("Build metal frame from: " + this.metal);
    }
}
