package Behavioral.Command;

import Behavioral.Command.TankModule.Engine;
import Behavioral.Command.TankModule.TankModule;

public class EngineRemote {
    
    public static TankModule getModule() {
        return new Engine();
    }
}