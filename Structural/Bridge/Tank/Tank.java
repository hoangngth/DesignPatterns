package Structural.Bridge.Tank;

import Structural.Bridge.Engine.Engine;

public abstract class Tank {

    protected Engine engine;

    public Tank(Engine engine) {
        this.engine = engine;
    }

    public abstract void runsWith();
}