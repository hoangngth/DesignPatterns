package Behavioral.State;

import Behavioral.State.states.*;

public class HumanStatus {
    
    public static void main(String[] args) {

        HumanContext humanContext = new HumanContext();

        humanContext.setState(new EatState());
        humanContext.applyState();

        humanContext.setState(new WorkState());
        humanContext.setState(new SleepState());
        humanContext.applyState();
    }
}