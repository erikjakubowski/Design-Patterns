package proxy.pattern.original.classes;

public class ConcreteSubject extends Subject {
    @Override
    public void doSomeWork() {
        System.out.println("Im from the concrete class");
    }
}
