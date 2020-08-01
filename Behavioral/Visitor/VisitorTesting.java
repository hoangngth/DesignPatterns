package Behavioral.Visitor;

import Behavioral.Visitor.visitables.*;
import Behavioral.Visitor.visitors.*;

public class VisitorTesting {
    
    public static void main(String[] args) {

        Visitor visitorEvent = new VisitorEvent();
        Visitable armor = new Armor(19.99);
        Visitable weapon = new Weapon(12.99);
        Visitable potion = new Potion(0.79);
        Visitable gem = new Gem(4.99);

        System.out.println(armor.accept(visitorEvent));
        System.out.println(weapon.accept(visitorEvent));
        System.out.println(potion.accept(visitorEvent));
        System.out.println(gem.accept(visitorEvent));
    }
}