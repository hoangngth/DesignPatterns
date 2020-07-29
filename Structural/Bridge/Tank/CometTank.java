package Structural.Bridge.Tank;

import Structural.Bridge.Engine.Engine;

public class CometTank extends Tank {

    public CometTank(Engine engine) {
        super(engine);
    }

    @Override
    public void runsWith() {
        System.out.println("Comet Tank runs with engine: " + engine.name() 
                            + " .Using fuel type: " + engine.fuelType());
    }
}