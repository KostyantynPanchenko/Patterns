package mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator {

    private List<User> users;
    
    public ChatMediatorImpl(){
        this.users=new ArrayList<>();
    }
    
    @Override
    public void addUser(User user){
        this.users.add(user);
    }
    
    @Override
    public void sendMessage(String msg, User user) {
        this.users.stream().forEach(u -> {
            if (u != user ) {
                u.receive(msg);
            }
        });
    }

}
