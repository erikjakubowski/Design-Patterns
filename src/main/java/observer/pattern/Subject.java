package observer.pattern;

import java.util.ArrayList;
import java.util.List;

public class Subject implements ISubject {

    List<Observer> observerList = new ArrayList<Observer>();

    private int _flag;

    public int get_flag() {
        return _flag;
    }

    public void set_flag(int _flag) {
        this._flag = _flag;

        //subject is notifying observers of flag change
        notifyObservers();
    }

    public void register(Observer o) {

        //add observers that will be notified to changes/updates
        observerList.add(o);
    }

    public void unregister(Observer o) {
        observerList.remove(o);
    }

    public void notifyObservers() {
        for (int i = 0; i < observerList.size(); i++) {
            observerList.get(i).update();
        }
    }

}
