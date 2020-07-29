package Behavioral.TemplateMethod;

public class BanhmiChay extends BanhmiTemplate {

    @Override
    public boolean wantMeat() {
        return false;
    }

    @Override
    public void addMeat() {

    }

    @Override
    public void addVegetable() {
        System.out.println("Add Vegetable");
    }

    @Override
    public void addChilli() {
        System.out.println("Add Chilli");
    }

    @Override
    public void addCondiment() {
        System.out.println("Add Condiment");
    }
    
}