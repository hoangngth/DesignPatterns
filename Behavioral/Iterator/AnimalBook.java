package Behavioral.Iterator;

import java.util.Iterator;

public class AnimalBook {
    
    private DogList dogs;
    private CatArray cats;
    private FoxHashTable foxes;

    public AnimalBook() {

        this.dogs = new DogList();
        addDogs(dogs);

        this.cats = new CatArray();
        addCats(cats);

        this.foxes = new FoxHashTable();
        addFoxes(foxes);
    }

    private void addDogs(DogList dogs) {
        dogs.addDog("Nick", 3);
        dogs.addDog("Sparky", 1);
        dogs.addDog("Laslo", 4);
    }

    private void addCats(CatArray cats) {
        cats.addCat("Lumi", 2);
        cats.addCat("Hoven", 5);
        cats.addCat("Emili", 3);
    }

    private void addFoxes(FoxHashTable foxes) {
        foxes.addFox("Finnegan", 3);
        foxes.addFox("Roxy", 6);
        foxes.addFox("Dixie", 2);
    }

    public void showAnimals() {

        Iterator<AnimalInfo> dogsIterator = dogs.createIterator();
        Iterator<AnimalInfo> catsIterator = cats.createIterator();
        Iterator<AnimalInfo> foxesIterator = foxes.createIterator();

        printAnimals(dogsIterator);
        printAnimals(catsIterator);
        printAnimals(foxesIterator);
    }

    private void printAnimals(Iterator<AnimalInfo> animalsIterator) {

        while (animalsIterator.hasNext()) {
            AnimalInfo animalInfo = (AnimalInfo)animalsIterator.next();
            System.out.println(animalInfo);
        }
    }

}