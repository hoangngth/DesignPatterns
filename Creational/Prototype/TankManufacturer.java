package Creational.Prototype;

import Creational.Builder.PartTypes.CannonType;
import Creational.Builder.PartTypes.HullType;
import Creational.Builder.PartTypes.TrackType;
import Creational.Builder.PartTypes.TurretType;

public class TankManufacturer {
    
    public static void main(String[]args) {

        Tank tank1 = new Tank("Tiger", TrackType.CONTINOUS, HullType.THICK, TurretType.SQUARE, CannonType.LONG, 1);
        Tank tank2 = tank1.clone();
        tank2.setModelNo(2);
        tank2.setTurretType(TurretType.ROUND);

        System.out.println(tank1);
        System.out.println(tank2);
    }
}