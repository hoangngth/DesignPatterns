package Behavioral.Command.Command;

import Behavioral.Command.TankModule.TankModule;

public class TurnEngineOff implements Command {

    private TankModule engine;

    public TurnEngineOff(TankModule engine) {
        this.engine = engine;
    }

    @Override
    public void execute() {
        engine.turnOff();
    }
}