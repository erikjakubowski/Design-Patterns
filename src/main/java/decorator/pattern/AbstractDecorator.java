package decorator.pattern;

public abstract class AbstractDecorator extends Component{

    protected Component com;

    public void SetTheCompoent(Component c) {
        com = c;
    }

    public void doJob() {
        if (com != null ){
            com.doJob();

        }
    }

}
