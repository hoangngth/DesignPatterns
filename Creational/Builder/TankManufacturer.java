package Creational.Builder;

import Creational.Builder.Builder.TankComponentBuilder;
import Creational.Builder.PartTypes.*;

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