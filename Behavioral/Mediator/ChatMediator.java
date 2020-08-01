package Behavioral.Mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediator implements IChatMediator {

    private List<AUser> users = new ArrayList<>();

    public ChatMediator(String roomName) {
        System.out.printf("Chat room %s created.\n", roomName);
    }

    @Override
    public void sendMessage(AUser sender, String message) {   
        for (AUser user : users) {
            if (sender.name != user.name) {
                user.receive(message);
            }
        }
    }

    @Override
    public void addUser(AUser user) {
        this.users.add(user);
        System.out.printf("%s joined the chat. Welcome!\n", user.name);
    }
    
}