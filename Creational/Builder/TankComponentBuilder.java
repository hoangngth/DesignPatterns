package Creational.Builder;

import Creational.Builder.PartTypes.*;

public class TankComponentBuilder implements TankBuilder {

    private String name;
    private TrackType trackType;
    private HullType hullType;
    private TurretType turretType;
    private CannonType cannonType;

    @Override
    public TankBuilder setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public TankBuilder setTrack(TrackType trackType) {
        this.trackType = trackType;
        return this;
    }

    @Override
    public TankBuilder setHull(HullType hullType) {
        this.hullType = hullType;
        return this;
    }

    @Override
    public TankBuilder setTurret(TurretType turretType) {
        this.turretType = turretType;
        return this;
    }

    @Override
    public TankBuilder setCannon(CannonType cannonType) {
        this.cannonType = cannonType;
        return this;
    }

    @Override
    public Tank build() {
        return new Tank(name, trackType, hullType, turretType, cannonType);
    }

  
    
}