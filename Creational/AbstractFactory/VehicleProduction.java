package Creational.AbstractFactory;

import Creational.AbstractFactory.Factory.MaterialType;
import Creational.AbstractFactory.Factory.VehicleAbstractFactory;
import Creational.AbstractFactory.Factory.VehicleFactory;

public class VehicleProduction {
    
    public static void main(String []args) {

        VehicleAbstractFactory factory = VehicleFactory.getFactory(MaterialType.STEEL);

        factory.produceTank().produce();
        factory.produceAircraft().produce();
    }
}