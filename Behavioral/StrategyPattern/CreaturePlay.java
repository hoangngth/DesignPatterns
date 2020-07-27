package Behavioral.StrategyPattern;

import Behavioral.StrategyPattern.Creature.Animal;
import Behavioral.StrategyPattern.Creature.Bird;
import Behavioral.StrategyPattern.Creature.Dog;
import Behavioral.StrategyPattern.Flyability.Flyable;

public class CreaturePlay {
    
    public static void main(String[] args) {

        Animal dog1 = new Dog("milu", 13.5);
        Animal bird1 = new Bird("kuro", 3.2);

        dog1.repeatingSounds();
        dog1.printFlyStatus();
        
        bird1.repeatingSounds();
        bird1.printFlyStatus();

        // set Dog to Flyable
        dog1.setFlyability(new Flyable());
        dog1.printFlyStatus();
    }
}