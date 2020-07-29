package Behavioral.Command.Command;

import Behavioral.Command.TankModule.TankModule;

public class TurnEngineOn implements Command {

    private TankModule engine;

    public TurnEngineOn(TankModule engine) {
        this.engine = engine;
    }

    @Override
    public void execute() {
        engine.turnOn();
    }
    
}