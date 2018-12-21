package mediator.pattern;

public class Boss extends Friend {

    public Boss(Mediator mediator, String name) {
        super(mediator);
        this.name = name;
    }

    public void Send(String msg){
        mediator.Send(this, msg);
    }

    public void Notify(String msg){
        System.out.println(String.format("Boss gets message:  %s", msg));
    }
}
