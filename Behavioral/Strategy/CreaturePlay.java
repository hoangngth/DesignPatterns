package Behavioral.Strategy;

import Behavioral.Strategy.Creature.Animal;
import Behavioral.Strategy.Creature.Bird;
import Behavioral.Strategy.Creature.Dog;
import Behavioral.Strategy.Flyability.Flyable;

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