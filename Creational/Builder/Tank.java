package Creational.Builder;

import Creational.Builder.PartTypes.*;

public class Tank {

    private String name;
    private TrackType trackType;
    private HullType hullType;
    private TurretType turretType;
    private CannonType cannonType;

    public Tank(String name, TrackType trackType, HullType hullType, TurretType turretType, CannonType cannonType) {
        this.name = name;
        this.trackType = trackType;
        this.hullType = hullType;
        this.turretType = turretType;
        this.cannonType = cannonType;
    }

    @Override
    public String toString() {
        return "Tank " + name + " [trackType=" + trackType + ", hullType=" + hullType + ", turretType="
                + turretType + ", cannonType=" + cannonType + "]";
    }
}