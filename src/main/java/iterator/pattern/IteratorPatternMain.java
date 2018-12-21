package iterator.pattern;

public class IteratorPatternMain {
    public static void main(String [] args){
        System.out.println("*** Iterator Pattern Demo ***");
        ISubject Sc_Subject = new Science();
        ISubject Ar_Subject = new Arts();

        IIterator Sc_Iterator = Sc_Subject.CreateIterator();
        IIterator Ar_Iterator = Ar_Subject.CreateIterator();

        System.out.println("\nPrint Science Fields");
        PRINT(Sc_Iterator);

        System.out.println("\nPrint Art Fields");
        PRINT(Ar_Iterator);

        System.out.println("*** End Iteration ***");

    }

    public static void PRINT(IIterator iterator){
        while (!iterator.isDone()){
            System.out.println(iterator.Next());
        }
    }
}
