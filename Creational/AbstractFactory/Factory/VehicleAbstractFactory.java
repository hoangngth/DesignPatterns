package Creational.AbstractFactory.Factory;

import Creational.AbstractFactory.Aircraft.Aircraft;
import Creational.AbstractFactory.Tank.Tank;

public abstract class VehicleAbstractFactory {
    
    public abstract Tank produceTank();
    public abstract Aircraft produceAircraft();
}