package Creational.AbstractFactory.Factory;

import Creational.AbstractFactory.Aircraft.Aircraft;
import Creational.AbstractFactory.Aircraft.AluminiumAircraft;
import Creational.AbstractFactory.Tank.AluminiumTank;
import Creational.AbstractFactory.Tank.Tank;

public class AluminiumFactory extends VehicleAbstractFactory {

    @Override
    public Tank produceTank() {
        return new AluminiumTank();
    }

    @Override
    public Aircraft produceAircraft() {
        return new AluminiumAircraft();
    }
    

}