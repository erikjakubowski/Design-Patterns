package state.pattern;

public class On extends RemoteControl {
    @Override
    public void pressSwitch(TV context) {
        System.out.println("I'm On...Going to be off now.");
        context.setState(new Off());
    }
}
