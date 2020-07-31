package Behavioral.State.states;

public class WorkState implements State {

    @Override
    public void handleRequest() {
        System.out.println("Working State.");
    }
    
}