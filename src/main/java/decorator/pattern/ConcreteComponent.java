package decorator.pattern;

public class ConcreteComponent extends Component{
    @Override
    public void doJob() {
        System.out.println("This is from the Concrete Component and is closed for modifying");
    }
}
