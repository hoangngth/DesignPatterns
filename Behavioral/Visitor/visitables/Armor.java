package Behavioral.Visitor.visitables;

import Behavioral.Visitor.visitors.Visitor;

public class Armor implements Visitable {
    
    private double price;

    public Armor(double price) {
        this.setPrice(price);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}