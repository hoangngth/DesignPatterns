package Structural.Decorator;

public abstract class TankModificationDecorator implements Tank {

    protected Tank tempTank;

    public TankModificationDecorator(Tank tempTank) {
        this.tempTank = tempTank;
    }

    @Override
    public String getModifications() {
        return tempTank.getModifications();
    }
    
    @Override
    public double getPrice() {
        return tempTank.getPrice();
    }

    @Override
    public double getWeight() {
        return tempTank.getWeight();
    }
}