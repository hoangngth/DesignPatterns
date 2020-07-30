package Behavioral.Iterator;

import java.util.Arrays;
import java.util.Iterator;

public class CatArray implements AnimalIterator {

    AnimalInfo[] cats;
    private int arrayIndex = 0;

    public CatArray() {
        cats = new AnimalInfo[3];
    }

    public void addCat(String name, int age) {
        cats[arrayIndex] = new AnimalInfo(name, age);
        arrayIndex++;
    }

    @Override
    public Iterator<AnimalInfo> createIterator() {
        return Arrays.asList(cats).iterator();
    }

}