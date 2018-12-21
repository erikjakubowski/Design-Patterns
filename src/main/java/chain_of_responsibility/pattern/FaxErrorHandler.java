package chain_of_responsibility.pattern;

public class FaxErrorHandler implements IReciever {

    private IReciever nextReciever;

    public FaxErrorHandler(IReciever nextReciever) {
        this.nextReciever = nextReciever;
    }

    @Override
    public Boolean processMessage(Message message) {

        if (message.Text.contains("Fax")) {
            System.out.println("FaxErrorHandler processed " + message.messagePriority + " priority issue: " + message.Text);
            return true;
        } else {
            if (nextReciever != null) {
                nextReciever.processMessage(message);
            }
        }
        return false;
    }



}
