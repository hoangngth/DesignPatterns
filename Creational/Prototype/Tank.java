package Creational.Prototype;

import Creational.Builder.PartTypes.*;

public class Tank implements Cloneable {
    
    private String name;
    private TrackType trackType;
    private HullType hullType;
    private TurretType turretType;
    private CannonType cannonType;
    private int modelNo;

    public Tank(String name, TrackType trackType, HullType hullType, TurretType turretType, CannonType cannonType, int modelNo) {
        this.name = name;
        this.trackType = trackType;
        this.hullType = hullType;
        this.turretType = turretType;
        this.cannonType = cannonType;
        this.modelNo = modelNo;
    }

    @Override
    protected Tank clone() {
        try {
            return (Tank) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String toString() {
        return "Tank " + name + " modelNo: " + modelNo + " [trackType=" + trackType + ", hullType="
                + hullType + ", turretType=" + turretType + ", cannonType=" + cannonType + "]";
    }

    public void setModelNo(int modelNo) {
        this.modelNo = modelNo;
    }

    public void setTurretType(TurretType turretType) {
        this.turretType = turretType;
    }
}