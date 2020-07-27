package Behavioral.Strategy.Creature;

import Behavioral.Strategy.Flyability.Fly;

public abstract class Animal {

    private String name;
    private double weight;
    private String sound;
    protected Fly flyAbility;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setWeight(double weight) {

        if (weight <= 0) {
            this.weight = 1.0;
        } else {
            this.weight = weight;
        } 
    }

    public double getWeight() {
        return this.weight;
    }

    public String setSound(String sound) {
        return this.sound = sound;
    }

    public String getSound() {
        return this.sound;
    }

    public void printAnimalInfo() {
        System.out.printf("Haha %s goes %s. Weight: %d\n", this.name, this.sound, this.weight);
    }

    public abstract void repeatingSounds();
    
    private boolean triesToFly() {
        return flyAbility.fly();
    }

    public void setFlyability(Fly newFlyability) {
        this.flyAbility = newFlyability;
    }

    public void printFlyStatus() {
        if (!triesToFly()) {
            System.out.printf("%s can't fly\n", this.getName());
        } else System.out.printf("%s is flying!!!\n", this.getName());
    }
}