package Structural.Bridge.Engine;

public class BritishEngine implements Engine {

    @Override
    public String name() {
        return "Rolls-Royce Meteor V12";
    }

    @Override
    public String fuelType() {
        return "Diesel";
    }
    
}