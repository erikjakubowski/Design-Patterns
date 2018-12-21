package iterator.pattern;

public interface IIterator {
    void First();
    String Next();
    Boolean isDone();
    String CurrentItem();
}
