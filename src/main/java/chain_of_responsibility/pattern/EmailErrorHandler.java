package chain_of_responsibility.pattern;

public class EmailErrorHandler implements IReciever {

    private IReciever iReciever;


    public EmailErrorHandler(IReciever iReciever) {
        this.iReciever = iReciever;
    }

    @Override
    public Boolean processMessage(Message message) {

        if (message.Text.contains("Email")){
            System.out.println("Email Error Handler processed " + message.messagePriority + " priority issue: " + message.Text);
            return true;
        }else {
            if (iReciever != null){
                iReciever.processMessage(message);
            }
        }
        return false;
    }
}
