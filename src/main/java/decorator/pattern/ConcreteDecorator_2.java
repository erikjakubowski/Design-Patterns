package decorator.pattern;

public class ConcreteDecorator_2 extends AbstractDecorator {
    @Override
    public void doJob() {
        System.out.println("");
        System.out.println("**** Start Second Decorator ****");
        super.doJob();
        System.out.println("Job From Concrete Decorator Two");
        System.out.println("**** End Example ****");
    }
}
