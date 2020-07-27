package Creational.FactoryMethod;

public abstract class Tank {

    private String name;
    private double weight;

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println("Tank is running.");
    }

    public void shoot() {
        System.out.println("Tank is shooting.");
    }
 }