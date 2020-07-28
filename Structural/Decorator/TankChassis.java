package Structural.Decorator;

// Concrete class
public class TankChassis implements Tank {
    
    @Override
    public String getModifications() {
        return "Tank Modifications: ";
    }

    @Override
    public double getPrice() {
        return 100.0;
    }

    @Override
    public double getWeight() {
        return 20.0;
    }
}