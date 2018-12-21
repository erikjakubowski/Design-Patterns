package observer.pattern;

/**
 * Define a one-to-many dependency between objects so that when one object changes state,
 * all its dependents are notified and updated automatically.
 */

public class ObserverPatternMain {

    public static void main(String[] args){
        System.out.println("**** Observer Demo Mode ****");
        Observer ob1 = new Observer();
        Subject sub1 = new Subject();

        //Add this as an Observer to the Subjects Observer list
        sub1.register(ob1);

        System.out.println("Setting flag to 5");
        sub1.set_flag(5);
        System.out.println("Setting flag to 25");
        sub1.set_flag(25);

        sub1.unregister(ob1);
        //Wont notify because it was unregistered as observer

        System.out.println("Setting flag to 50");
        sub1.set_flag(50);
    }
}
