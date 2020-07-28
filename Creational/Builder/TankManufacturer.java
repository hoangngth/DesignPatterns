package Creational.Builder;

import Creational.Builder.PartTypes.CannonType;
import Creational.Builder.PartTypes.HullType;
import Creational.Builder.PartTypes.TrackType;
import Creational.Builder.PartTypes.TurretType;

public class TankManufacturer {
    
    public static void main(String[]args) {

        Tank tank = new TankComponentBuilder()
                    .setName("Tiger")
                    .setTrack(TrackType.CONTINOUS)
                    .setHull(HullType.THICK)
                    .setTurret(TurretType.SQUARE)
                    .setCannon(CannonType.LONG)
                    .build();
        System.out.println(tank);
    }
}