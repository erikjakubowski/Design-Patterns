package iterator.pattern;

import java.util.LinkedList;

public class ScienceIterator implements IIterator {
    private LinkedList<String> subjects;
    private int position;

    public ScienceIterator(LinkedList<String> subjects) {
        this.subjects = subjects;
        position = 0;
    }

    public void First() {
        position = 0;
    }

    public String Next() {
        return subjects.get(position++);
    }

    public Boolean isDone() {
        return position >= subjects.size();
    }

    public String CurrentItem() {
        return subjects.get(position);
    }

}
