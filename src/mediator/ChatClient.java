
package mediator;

public class ChatClient {

    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorImpl();
        
        User pankaj = new UserImpl(mediator, "Pankaj");
        User lisa = new UserImpl(mediator, "Lisa");
        User saurabh = new UserImpl(mediator, "Saurabh");
        User david = new UserImpl(mediator, "David");
        
        mediator.addUser(pankaj);
        mediator.addUser(lisa);
        mediator.addUser(saurabh);
        mediator.addUser(david);

        pankaj.send("Hi All");
    }

}
