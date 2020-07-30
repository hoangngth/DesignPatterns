package Behavioral.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class DogList implements AnimalIterator {

    private ArrayList<AnimalInfo> dogs;

    public DogList() {
        dogs = new ArrayList<AnimalInfo>();
    }

    public void addDog(String name, int age) {
        dogs.add(new AnimalInfo(name, age));
    }

    @Override
    public Iterator<AnimalInfo> createIterator() {
        return dogs.iterator();
    }
    
}