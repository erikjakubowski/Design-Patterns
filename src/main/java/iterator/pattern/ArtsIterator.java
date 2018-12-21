package iterator.pattern;

public class ArtsIterator implements IIterator {
    private String[] subjects;
    private int position;

    public ArtsIterator(String[] subjects) {
        this.subjects = subjects;
        position = 0;
    }

    public void First() {
        position = 0;
    }

    public String Next() {
        return subjects[position++];
    }

    public Boolean isDone() {
        return position >= subjects.length;
    }

    public String CurrentItem() {
        return subjects[position];
    }
}
