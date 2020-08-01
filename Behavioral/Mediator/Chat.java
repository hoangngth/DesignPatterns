package Behavioral.Mediator;

public class Chat {
    
    public static void main(String[] args) {

        IChatMediator discussion = new ChatMediator("Dicussion");

        AUser fox = new User("Fox", discussion);
        AUser cat = new User("Cat", discussion);
        AUser dog = new User("Dog", discussion);
        AUser bird = new User("Bird", discussion);

        discussion.addUser(fox);
        discussion.addUser(cat);
        discussion.addUser(dog);
        discussion.addUser(bird);

        fox.send("What does the fox say?");
        cat.send("I don't care");
        dog.send("Come on bro, be friendly.");
        bird.send("Tweet tweet");
    }
}