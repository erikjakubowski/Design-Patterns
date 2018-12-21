package mediator.pattern;


/**
 *
 * Define an object that encapsulates how a set of objects interacts.
 * The mediator pattern promotes loose coupling by keeping objects from referring to each other explicitly,
 * and it lets you vary their interaction independently.
 */
public class MediatorPatternMain {

    public static void main(String[] args)
    {
        System.out.println("***Mediator Pattern Demo***\n");
        ConcreteMediator m = new ConcreteMediator();

        Friend1 A= new Friend1(m,"Person A");
        Friend2 B = new Friend2(m,"Person B");
        Boss boss = new Boss(m,"Boss");

        m.setFriend1(A);
        m.setFriend2(B);
        m.setBoss(boss);

        A.Send("[A here]Good Morrning. Can we discuss the mediator pattern?");
        B.Send("[B here]Good Morning.Yes, we can discuss now.");
        boss.Send("\n[Boss here]:Please get back to work quickly");
    }
}
