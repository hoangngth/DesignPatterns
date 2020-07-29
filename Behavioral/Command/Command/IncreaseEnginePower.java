package Behavioral.Command.Command;

import Behavioral.Command.TankModule.TankModule;

public class IncreaseEnginePower implements Command {

    private TankModule engine;

    public IncreaseEnginePower(TankModule engine) {
        this.engine = engine;
    }

    @Override
    public void execute() {
        engine.increasePower();
    }

}