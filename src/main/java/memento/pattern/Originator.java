package memento.pattern;

public class Originator {
    private String state;
    Memento m;

    public void setState(String state) {
        this.state = state;
        System.out.println("State at present: " + state);
    }
    public Memento OriginatorMemento(){
        m = new Memento(state);
        return m;
    }
    public void Revert(Memento memento){
        System.out.println("Restoring previous state...");
        state = memento.getState();
        System.out.println("Start at present: " + state);

    }
}
