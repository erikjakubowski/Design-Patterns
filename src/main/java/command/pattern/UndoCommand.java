package command.pattern;

public class UndoCommand implements ICommand {
    private Reciever reciever;

    UndoCommand(Reciever resv){
        reciever = resv;
    }

    public void Do() {
        reciever.performUndo();
    }
}
