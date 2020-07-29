package Structural.Bridge.Engine;

public class GermanEngine implements Engine {

    @Override
    public String name() {
        return "Maybach HL230 P45 V-12";
    }

    @Override
    public String fuelType() {
        return "Gasoline";
    }
    
}