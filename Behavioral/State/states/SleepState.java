package Behavioral.State.states;

public class SleepState implements State {

    @Override
    public void handleRequest() {
        System.out.println("Sleeping State.");
    }
    
}