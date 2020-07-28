package Creational.AbstractFactory.Factory;

import Creational.AbstractFactory.Aircraft.Aircraft;
import Creational.AbstractFactory.Aircraft.SteelAircraft;
import Creational.AbstractFactory.Tank.SteelTank;
import Creational.AbstractFactory.Tank.Tank;

public class SteelFactory extends VehicleAbstractFactory {

    @Override
    public Tank produceTank() {
        return new SteelTank();
    }

    @Override
    public Aircraft produceAircraft() {
        return new SteelAircraft();
    }
    
}