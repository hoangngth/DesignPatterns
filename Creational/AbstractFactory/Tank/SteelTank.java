package Creational.AbstractFactory.Tank;

public class SteelTank implements Tank {

    @Override
    public void produce() {
        System.out.println("Produced Steel Tank.");
    }
    
}