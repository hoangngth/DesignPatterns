package Behavioral.Visitor.visitors;

import Behavioral.Visitor.visitables.*;

public interface Visitor {
    double visit(Potion potion);
    double visit(Gem gem);
    double visit(Weapon weapon);
    double visit(Armor armor);
}