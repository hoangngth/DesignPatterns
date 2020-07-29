package Behavioral.Command;

import Behavioral.Command.Command.Command;

public class TankIgniter {
    
    private Command command;
    private Command onCommand;
    private Command offCommand;

    public TankIgniter(Command command) {
        this.command = command;
    }

    public TankIgniter(Command onCommand, Command offCommand) {
        this.onCommand = onCommand;
        this.offCommand = offCommand;
    }

    public void press() {
        System.out.println("Igniter pressed");
        command.execute();
    }

    public void pressOn() {
        System.out.println("Igniter 2 on");
        onCommand.execute();
    }

    public void pressOff() {
        System.out.println("Igniter 2 off");
        offCommand.execute();
    }

}