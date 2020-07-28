package Structural.Decorator;

public class ArmorSkirt extends TankModificationDecorator {

    public ArmorSkirt(Tank tempTank) {
        super(tempTank);
        System.out.println("Adding Armor Skirt");
    }
    
    @Override
    public String getModifications() {
        return tempTank.getModifications() + "\nArmor Skirt.";
    }

    @Override
    public double getWeight() {
        return tempTank.getWeight() + 1.2;
    }
}