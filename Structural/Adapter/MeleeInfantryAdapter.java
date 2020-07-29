package Structural.Adapter;

public class MeleeInfantryAdapter implements BasicInfantry {
    
    private MeleeInfantry meleeInfantry;

    public MeleeInfantryAdapter(MeleeInfantry meleeInfantry) {
        this.meleeInfantry = meleeInfantry;
    }

    @Override
    public void shoot() {
        meleeInfantry.smash();
    }

    @Override
    public void walk() {
        meleeInfantry.run();
    }
    
}