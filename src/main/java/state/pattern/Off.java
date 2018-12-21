package state.pattern;

public class Off extends RemoteControl {
    @Override
    public void pressSwitch(TV context) {
        System.out.println("Im OFF...Going to be on now.");
        context.setState(new On());
    }
}
