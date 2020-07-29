package Structural.Adapter;

public class InfantryActivity {
    
    public static void main(String[] args) {

        RangedInfantry rangedInfantry = new RangedInfantry();
        rangedInfantry.shoot();
        rangedInfantry.walk();

        MeleeInfantry meleeInfantry = new MeleeInfantry();
        MeleeInfantryAdapter meleeInfantryAdapter = new MeleeInfantryAdapter(meleeInfantry);
        meleeInfantryAdapter.shoot();
        meleeInfantryAdapter.walk();
    }
}