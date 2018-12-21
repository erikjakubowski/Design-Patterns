package mediator.pattern;

public class Friend1 extends Friend {

    public Friend1(Mediator mediator, String name) {
        super(mediator);
        this.name = name;
    }


    public void Send(String msg){
        mediator.Send(this, msg);
    }

    public void Notify(String msg){
        System.out.println(String.format("Person A gets message:  %s", msg));
    }


}
