package iterator.pattern;

import java.util.LinkedList;

public class Science implements ISubject {
    private LinkedList<String> subjects;

    public Science(){
        subjects = new LinkedList<String>();
        subjects.add("Math");
        subjects.add("Physics");
        subjects.add("Computer Science");
    }

    public IIterator CreateIterator() {
        return new ScienceIterator(subjects);
    }

}
