package chain_of_responsibility.pattern;

public class IssueRaiser {

    public IReciever setFirstReciever;

    public IssueRaiser(IReciever setFirstReciever) {
        this.setFirstReciever = setFirstReciever;
    }

    public void RaiseMessage(Message msg){

        if(setFirstReciever != null){
            setFirstReciever.processMessage(msg);
        }

    }
}
