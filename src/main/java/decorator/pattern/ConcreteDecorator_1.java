package decorator.pattern;

public class ConcreteDecorator_1 extends AbstractDecorator {
    @Override
    public void doJob() {
        super.doJob();
        System.out.println("Example of Concrete One Decorator");
    }
}
