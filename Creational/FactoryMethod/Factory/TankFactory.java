package Creational.FactoryMethod.Factory;

import Creational.FactoryMethod.Tank.HeavyTank;
import Creational.FactoryMethod.Tank.LightTank;
import Creational.FactoryMethod.Tank.MediumTank;
import Creational.FactoryMethod.Tank.Tank;

public class TankFactory {
    
    public static Tank produceTank(TankType tankType) {
        
        switch(tankType) {

            case LIGHT:
                return new LightTank();
            case MEDIUM:
                return new MediumTank();
            case HEAVY:
                return new HeavyTank();
            default:
                throw new IllegalArgumentException("This tank type is not available.");
        }
    }
}