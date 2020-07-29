package Behavioral.Command.Command;

import Behavioral.Command.TankModule.TankModule;

public class DecreaseEnginePower implements Command {
    
    private TankModule engine;

    public DecreaseEnginePower(TankModule engine) {
        this.engine = engine;
    }

    @Override
    public void execute() {
        engine.decreasePower();
    }

}