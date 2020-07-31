package Structural.Flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * FlyweightFactory
 */
public class SoldierFactory {
    
    //final marks the reference, not the object. You can't make that reference point
    // to a different hash table. But you can do anything to that object,
    // including adding and removing things.
    private static final Map<String, ISoldier> soldiers = new HashMap<String, ISoldier>();

    private SoldierFactory() {
        throw new IllegalStateException();
    }
 
    public static synchronized ISoldier createSoldier(String name) {
        ISoldier soldier = soldiers.get(name);
        if (soldier == null) {
            waitingForCreateASoldier();
            soldier = new Soldier(name);
            soldiers.put(name, soldier);
        }
        return soldier;
    }
 
    public static synchronized int getTotalOfSoldiers() {
        return soldiers.size();
    }
 
    private static void waitingForCreateASoldier() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}