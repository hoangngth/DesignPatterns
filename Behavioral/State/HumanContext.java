package Behavioral.State;

import Behavioral.State.states.State;

public class HumanContext {
    
    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public void applyState() {
        state.handleRequest();
    }

}