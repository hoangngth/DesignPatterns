package Behavioral.TemplateMethod;

public abstract class BanhmiTemplate {
    
    public static int count = 0;

    public final void makeBanhmi() {

        count++;
        System.out.println("\nBanh mi #" + count);

        cutBanhmi();
        if (wantMeat()) addMeat();
        if (wantVegetable()) addVegetable();
        if (wantChilli()) addChilli();
        if (wantCondiment()) addCondiment();
        closeBanhmi();
    }

    protected boolean wantMeat() {
        return true;
    }

    protected boolean wantVegetable() {
        return true;
    }

    protected boolean wantChilli() {
        return true;
    }

    protected boolean wantCondiment() {
        return true;
    }

    private void cutBanhmi() {
        System.out.println("Cut open the Banh Mi!");
    }

    // public abstract method is accesible everywhere
    // protected abstract method is only accesible on the same package
    public abstract void addMeat();
    public abstract void addVegetable();
    public abstract void addChilli();
    public abstract void addCondiment();

    private void closeBanhmi() {
        System.out.println("Close the Banh Mi!");
    }
}