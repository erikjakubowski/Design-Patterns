package command.pattern;

public class RedoCommand implements ICommand {
    private Reciever rec;
    RedoCommand(Reciever reciever){
        this.rec = reciever;
    }

    public void Do() {
        rec.performRedo();
    }
}
