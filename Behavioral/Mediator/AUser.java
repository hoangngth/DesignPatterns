package Behavioral.Mediator;

public abstract class AUser {

    protected IChatMediator mediator;
    protected String name;

    public AUser(String name, IChatMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    abstract void send(String message);
    abstract void receive(String message);
}
