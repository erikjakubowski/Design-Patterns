package decorator.pattern;

/**
 * Attach additional responsibilities to an object dynamically.
 * Decorators provide a flexible alternative to subclassing for extending functionality.
 */

public class DecoratorPatternMain {
    public static void main(String[] args){
        ConcreteComponent cc = new ConcreteComponent();

        ConcreteDecorator_1 cc1 = new ConcreteDecorator_1();
        //Decorating Concrete Component with Concrete_1
        cc1.SetTheCompoent(cc);
        cc1.doJob();

        ConcreteDecorator_2 cc2 = new ConcreteDecorator_2();
        //Decorating Concrete Component with Concrete_1 and Concrete_2
        cc2.SetTheCompoent(cc1);
        cc2.doJob();
    }
}
