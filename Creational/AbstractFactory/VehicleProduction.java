package Creational.AbstractFactory;

import Creational.AbstractFactory.Factories.MaterialType;
import Creational.AbstractFactory.Factories.VehicleAbstractFactory;
import Creational.AbstractFactory.Factories.VehicleFactory;

public class VehicleProduction {
    
    public static void main(String []args) {

        VehicleAbstractFactory factory = VehicleFactory.getFactory(MaterialType.STEEL);

        factory.produceTank().produce();
        factory.produceAircraft().produce();
    }
}