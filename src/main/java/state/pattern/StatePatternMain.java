package state.pattern;

/**
 * Allow an object to alter its behavior when its internal state changes.
 * The object will appear to change its class.
 */

public class StatePatternMain {
    public static void main(String [] args){
        System.out.println("***State Pattern Demo***\n");
        Off initialState = new Off();
        TV tv = new TV(initialState);
        tv.pressButton();
        tv.pressButton();
    }
}
