package Behavioral.Iterator;

import java.util.Hashtable;
import java.util.Iterator;

public class FoxHashTable implements AnimalIterator {

    private Hashtable<Integer, AnimalInfo> foxes;
    private int hashKey = 0; // This should be hashed using hashCode()

    public FoxHashTable() {
        foxes = new Hashtable<Integer, AnimalInfo>();
    }

    public void addFox(String name, int age) {
        foxes.put(hashKey, new AnimalInfo(name, age));
        hashKey++;
    }

    @Override
    public Iterator<AnimalInfo> createIterator() {
        return foxes.values().iterator();
    }


}