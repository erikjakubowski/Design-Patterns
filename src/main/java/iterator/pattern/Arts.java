package iterator.pattern;

public class Arts implements ISubject {
   public String [] subjects;

    public Arts(){
        subjects = new String[2];
        subjects[0] = "English";
        subjects[1] = "Painting";
    }
    public IIterator CreateIterator(){
        return new ArtsIterator(subjects);
    }


}
