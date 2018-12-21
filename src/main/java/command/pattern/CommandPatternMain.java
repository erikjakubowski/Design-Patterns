package command.pattern;

/**
 * Encapsulate a request as an object,
 * thereby letting you parameterize clients with different requests,
 * queue or log requests, and support undoable operations.
 */

public class CommandPatternMain {
    public static void main(String [] args){
        System.out.println("**** Command Pattern Demo ****");
        Reciever intendedReciever = new Reciever();
        Invoke inv = new Invoke();
        UndoCommand undoCommand = new UndoCommand(intendedReciever);
        RedoCommand redoCommand = new RedoCommand(intendedReciever);
        inv.ExecuteCommand(undoCommand);
        inv.ExecuteCommand(redoCommand);

    }
}
