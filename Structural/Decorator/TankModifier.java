package Structural.Decorator;

public class TankModifier {
    
    public static void main(String[] args) {

        Tank tank = new Turret(new ArmorSkirt(new TankChassis()));
        System.out.println(tank.getModifications());
        System.out.println(tank.getPrice());
        System.out.println(tank.getWeight());
    }
}