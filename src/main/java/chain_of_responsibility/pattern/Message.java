package chain_of_responsibility.pattern;

public class Message {


    public String Text;
    public MessagePriority messagePriority;

    public Message(String message, MessagePriority messagePriority) {
        Text = message;
        this.messagePriority = messagePriority;
    }


}
