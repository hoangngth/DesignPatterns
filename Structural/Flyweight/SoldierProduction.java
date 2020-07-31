package Structural.Flyweight;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class SoldierProduction {
    
    private static List<ISoldier> soldiers = new ArrayList<>();
 
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        produceSoldier("Riflemen", 5, 12);
        produceSoldier("Grenadier", 4, 10);
        produceSoldier("Conscript", 6, 3);
        produceSoldier("Riflemen", 2, 1);
        long endTime = System.currentTimeMillis();
        System.out.println("---");
        System.out.println("Total soldiers made : " + soldiers.size());
        System.out.println("Total time worked : " + Duration.ofMillis(endTime - startTime).getSeconds() + " seconds");
        System.out.println("Total type of soldiers made : " + SoldierFactory.getTotalOfSoldiers());
    }

    private static void produceSoldier(String name, int number, int kills) {
        for (int i = 0; i < number; i++) {
            ISoldier soldier = SoldierFactory.createSoldier(name);
            soldier.promote(new Context((soldiers.size())+1, kills));
            soldiers.add(soldier);
        }
    }
}