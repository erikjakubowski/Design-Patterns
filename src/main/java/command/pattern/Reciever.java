package command.pattern;

public class Reciever {
    public void performUndo(){
        System.out.println("Undoing command");
    }
    public void performRedo(){
        System.out.println("Redoing command");
    }
}
