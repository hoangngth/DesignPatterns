package Structural.Decorator;

public class Turret extends TankModificationDecorator {

    public Turret(Tank tempTank) {
        super(tempTank);
        System.out.println("Adding Turret");
    }

    @Override
    public String getModifications() {
        return tempTank.getModifications() + "\nTurret.";
    }
    
    @Override
    public double getPrice() {
        return tempTank.getPrice() + 5.0;
    }

    @Override
    public double getWeight() {
        return tempTank.getWeight() + 2.0;
    }
}