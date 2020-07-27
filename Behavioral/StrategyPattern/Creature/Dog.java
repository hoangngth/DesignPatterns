package Behavioral.StrategyPattern.Creature;

import Behavioral.StrategyPattern.Flyability.UnFlyable;

public class Dog extends Animal {

    @Override
    public void repeatingSounds() {
        // TODO Auto-generated method stub
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