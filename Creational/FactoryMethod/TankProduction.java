package Creational.FactoryMethod;

public class TankProduction {
    
    public static void main(String []args) {

        Tank tank = TankFactory.produceTank(TankType.LIGHT);
        System.out.println(tank.getName());
        System.out.println(tank.getWeight());
    }
}