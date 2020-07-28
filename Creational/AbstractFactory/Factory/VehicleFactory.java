package Creational.AbstractFactory.Factory;

public class VehicleFactory {
    
    public static VehicleAbstractFactory getFactory(MaterialType materialType) {

        switch(materialType) {
            case ALUMINIUM:
                return new AluminiumFactory();
            case STEEL:
                return new SteelFactory();
            default:
                throw new IllegalArgumentException("This material type is not available.");
        }
    }
}