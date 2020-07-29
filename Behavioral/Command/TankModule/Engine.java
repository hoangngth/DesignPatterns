package Behavioral.Command.TankModule;

public class Engine implements TankModule {

    private int powerLevel = 0;

    @Override
    public void turnOn() {
        System.out.println("Turn ENGINE on");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn ENGINE off");
    }

    @Override
    public void increasePower() {
        powerLevel++;
        System.out.println("Increase ENGINE power to " + powerLevel);
    }

    @Override
    public void decreasePower() {
        powerLevel--;
        System.out.println("Decrease ENGINE power to " + powerLevel);
    }
    
}