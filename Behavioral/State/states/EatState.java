package Behavioral.State.states;

public class EatState implements State {

    @Override
    public void handleRequest() {
        System.out.println("Eating State.");
    }
    
}