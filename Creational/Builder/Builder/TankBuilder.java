package Creational.Builder.Builder;

import Creational.Builder.Tank;
import Creational.Builder.PartTypes.*;

public interface TankBuilder {
    TankBuilder setName(String name);
    TankBuilder setTrack(TrackType trackType);
    TankBuilder setHull(HullType hullType);
    TankBuilder setTurret(TurretType turretType);
    TankBuilder setCannon(CannonType cannonType);
    Tank build();
}