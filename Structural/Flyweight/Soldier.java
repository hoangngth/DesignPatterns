package Structural.Flyweight;

/**
 * Concrete Flyweight
 */
public class Soldier implements ISoldier {

    private String name;

    public Soldier(String name) {
        this.name = name;
        System.out.println(this.name + " on the field!");
    }

    @Override
    public void promote(Context context) {
        if (context.isPromoted()) {
            System.out.printf("%s#%d earned a promotion.\n", this.name, context.getId());
        } else {
            System.out.printf("%s#%d not promoted yet.\n", this.name, context.getId());
        }
    }
    
}