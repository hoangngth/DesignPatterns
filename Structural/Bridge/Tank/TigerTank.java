package Structural.Bridge.Tank;

import Structural.Bridge.Engine.Engine;

public class TigerTank extends Tank {

    public TigerTank(Engine engine) {
        super(engine);
    }

    @Override
    public void runsWith() {
        System.out.println("Tiger Tank runs with engine: " + engine.name() 
                            + " .Using fuel type: " + engine.fuelType());
    }
    
}