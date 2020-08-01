package Behavioral.Memento;

import java.util.HashMap;
import java.util.Map;

public class Caretaker {
    
    private Map<Integer, Memento> savepointStorage = new HashMap<Integer, Memento>();

    public void storeMemento(Memento memento, int saveSlotNumber) {
        System.out.println("Store to save slot #" + saveSlotNumber);
        savepointStorage.put(saveSlotNumber, memento);
    }

    public Memento restoreMemento(int saveSlotNumber) {
        System.out.println("Load save slot #" + saveSlotNumber);
        return savepointStorage.get(saveSlotNumber);
    }

    public void clearSavePointStorage() {
        System.out.println("Clearing all saves");
        savepointStorage.clear();
    }
}