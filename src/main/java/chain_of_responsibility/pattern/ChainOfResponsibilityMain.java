package chain_of_responsibility.pattern;


/**
 *
 *
 *Avoid coupling the sender of a request to its receiver by giving more than one object a chance to handle the request.
 * Chain the receiving objects and pass the request along the chain until an object handles it.
 *
 *
 */


public class ChainOfResponsibilityMain {

    public static void main(String [] args){


        System.out.println("------Chain of Responsibility Pattern------\n");

        IReciever faxHandler, emailHandler;

        emailHandler = new EmailErrorHandler(null);

        faxHandler = new FaxErrorHandler(emailHandler);

        IssueRaiser raiser = new IssueRaiser (faxHandler);

        Message m1 = new Message("Fax is reaching late to the destination ", MessagePriority.NORMAL);
        Message m2 = new Message("Email is not going ", MessagePriority.HIGH);
        Message m3 = new Message("In Email, BCC field is disabled occasionally ", MessagePriority.NORMAL);
        Message m4 = new Message("Fax is not reaching destination ", MessagePriority.HIGH);

        raiser.RaiseMessage(m1);
        raiser.RaiseMessage(m2);
        raiser.RaiseMessage(m3);
        raiser.RaiseMessage(m4);


    }


}
