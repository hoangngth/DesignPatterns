package Creational.AbstractFactory.Aircraft;

public class AluminiumAircraft implements Aircraft {

    @Override
    public void produce() {
        System.out.println("Produced Aluminium Aircraft.");
    }
    
}