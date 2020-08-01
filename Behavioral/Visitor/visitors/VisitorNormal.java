package Behavioral.Visitor.visitors;

import Behavioral.Visitor.visitables.Armor;
import Behavioral.Visitor.visitables.Gem;
import Behavioral.Visitor.visitables.Potion;
import Behavioral.Visitor.visitables.Weapon;

public class VisitorNormal implements Visitor {

    @Override
    public double visit(Potion potion) {
        return potion.getPrice() * 1.0;
    }

    @Override
    public double visit(Gem gem) {
        return gem.getPrice() * 1.0;
    }

    @Override
    public double visit(Weapon weapon) {
        return weapon.getPrice() * 1.0;
    }

    @Override
    public double visit(Armor armor) {
        return armor.getPrice() * 1.0;
    }
    
}