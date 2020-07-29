package Behavioral.Command;

import Behavioral.Command.Command.*;
import Behavioral.Command.TankModule.TankModule;

public class UsingRemote {
    
    public static void main(String[] args) {

        // Turn Engine On Block
        TankModule engine = EngineRemote.getModule(); // get module
        TurnEngineOn onCmd = new TurnEngineOn(engine); // get turn on command of module
        onCmd.execute(); // this is also possible (optional), but call on base on command method without modifications
        TankIgniter igniter = new TankIgniter(onCmd); // pass the command to igniter to execute engine command
        igniter.press(); // press execute engine command

        // Turn Engine Off Block
        TurnEngineOff offCmd = new TurnEngineOff(engine);
        igniter = new TankIgniter(offCmd);
        igniter.press();

        // Increase Engine Power Block
        IncreaseEnginePower incPow = new IncreaseEnginePower(engine);
        igniter = new TankIgniter(incPow);
        igniter.press();
        igniter.press();
        igniter.press();

        // Decrease Engine Power Block
        DecreaseEnginePower decPow = new DecreaseEnginePower(engine);
        igniter = new TankIgniter(decPow);
        igniter.press();
        igniter.press();

        TankIgniter igniter2 = new TankIgniter(onCmd, offCmd);
        igniter2.pressOn();
        igniter2.pressOff();
    }
}