package Behavioral.Visitor.visitors;

import Behavioral.Visitor.visitables.Armor;
import Behavioral.Visitor.visitables.Gem;
import Behavioral.Visitor.visitables.Potion;
import Behavioral.Visitor.visitables.Weapon;

public class VisitorEvent implements Visitor {

    @Override
    public double visit(Potion potion) {
        double discount = 0.2;
        System.out.printf("Discount %d%% for Potion!\n", (int)(discount * 100));
        return potion.getPrice() * (1.0 - discount);
    }

    @Override
    public double visit(Gem gem) {
        double discount = 0.5;
        System.out.printf("Discount %d%% for Gem!\n", (int)(discount * 100));
        return gem.getPrice() * (1.0 - discount);
    }

    @Override
    public double visit(Weapon weapon) {
        double discount = 0.3;
        System.out.printf("Discount %d%% for Potion!\n", (int)(discount * 100));
        return weapon.getPrice() * (1.0 - discount);
    }

    @Override
    public double visit(Armor armor) {
        double discount = 0.3;
        System.out.printf("Discount %d%% for Armor!\n", (int)(discount * 100));
        return armor.getPrice() * (1.0 - discount);
    }
    
}