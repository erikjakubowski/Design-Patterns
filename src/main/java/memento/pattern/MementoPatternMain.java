package memento.pattern;

/**
 * Without violating encapsulation,
 * capture and externalize an object’s internal state
 * so that the object can be restored to this state later.
 */

public class MementoPatternMain {
    public static void main(String [] args){
        System.out.println("** Memento Pattern Demo ***");
        Originator o = new Originator();
        o.setState("First State");

        CareTaker careTaker = new CareTaker();
        careTaker.SaveMemento(o.OriginatorMemento());

        o.setState("Second State");

        o.Revert(careTaker.RetrieveMemento());
    }
}
