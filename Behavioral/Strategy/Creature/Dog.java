package Behavioral.Strategy.Creature;

import Behavioral.Strategy.Flyability.UnFlyable;

public class Dog extends Animal {

    @Override
    public void repeatingSounds() {
        System.out.printf("%s %s\n", getSound(), getSound());
    }

    public Dog(String name, double weight) {
        // super();
        setName(name);
        setWeight(weight);
        setSound("Woof");
        flyAbility = new UnFlyable();
    }
    
}