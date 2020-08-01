package Behavioral.Visitor.visitables;

import Behavioral.Visitor.visitors.Visitor;

public interface Visitable {
    double accept(Visitor visitor);
}