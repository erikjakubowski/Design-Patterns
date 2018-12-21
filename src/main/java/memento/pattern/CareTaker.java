package memento.pattern;

public class CareTaker {
    private Memento memento;

    public void SaveMemento(Memento m) {
        memento = m;
    }
    public Memento RetrieveMemento(){
        return memento;
    }
}
