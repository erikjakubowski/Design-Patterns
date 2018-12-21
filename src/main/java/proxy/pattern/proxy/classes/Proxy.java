package proxy.pattern.proxy.classes;

import proxy.pattern.original.classes.ConcreteSubject;
import proxy.pattern.original.classes.Subject;

public class Proxy extends Subject {

    ConcreteSubject cs;

    @Override
    public void doSomeWork() {
        System.out.println("Proxy call is being created");
        if (cs == null){
            cs = new ConcreteSubject();
        }
        cs.doSomeWork();
    }
}
