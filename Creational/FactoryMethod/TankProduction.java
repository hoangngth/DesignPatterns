package Creational.FactoryMethod;

import Creational.FactoryMethod.Factory.TankFactory;
import Creational.FactoryMethod.Factory.TankType;
import Creational.FactoryMethod.Tank.Tank;

public class TankProduction {
    
    public static void main(String []args) {

        Tank tank = TankFactory.produceTank(TankType.LIGHT);
        System.out.println(tank.getName());
        System.out.println(tank.getWeight());
    }
}