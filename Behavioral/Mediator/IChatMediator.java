package Behavioral.Mediator;

public interface IChatMediator {
    void sendMessage(AUser sender, String message);
    void addUser(AUser user);
}