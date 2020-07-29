package Behavioral.TemplateMethod;

public class BanhmiThitKhongOt extends BanhmiTemplate {
    
    @Override
    public boolean wantChilli() {
        return false;
    }

    @Override
    public void addMeat() {
        System.out.println("Add Meat");
    }

    @Override
    public void addVegetable() {
        System.out.println("Add Vegetable");
    }

    @Override
    public void addChilli() {
        
    }

    @Override
    public void addCondiment() {
        System.out.println("Add Condiment");
    }
}