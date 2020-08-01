package Behavioral.Mediator;

public class User extends AUser {

    public User(String name, IChatMediator mediator) {
        super(name, mediator);
    }

    @Override
    void send(String message) {
        System.out.printf("%s sent: %s\n", name, message);
        mediator.sendMessage(this, message);
    }

    @Override
    void receive(String message) {
        System.out.printf("%s received: %s\n", name, message);
    }
    
}