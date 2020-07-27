package Creational.AbstractFactory.Aircraft;

public class SteelAircraft implements Aircraft {

    @Override
    public void produce() {
        System.out.println("Produced Steel Aircraft.");
    }
    
}