package Structural.Adapter;

public class RangedInfantry implements BasicInfantry {

    @Override
    public void shoot() {
        System.out.println("Shoot!");
    }

    @Override
    public void walk() {
        System.out.println("Walking.");
    }
    
}