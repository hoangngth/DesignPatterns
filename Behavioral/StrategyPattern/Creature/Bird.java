package Behavioral.StrategyPattern.Creature;

import Behavioral.StrategyPattern.Flyability.Flyable;

public class Bird extends Animal {

    @Override
    public void repeatingSounds() {
        // TODO Auto-generated method stub
        System.out.printf("%s %s\n", getSound(), getSound());
    }
    
    public Bird(String name, double weight) {
        // super();
        setName(name);
        setWeight(weight);
        setSound("Tweet");
        flyAbility = new Flyable();
    }
}