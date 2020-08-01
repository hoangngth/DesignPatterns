package Behavioral.Memento;

public class GameLoader {
    
    public static void main(String[] args) {

        Caretaker caretaker = new Caretaker();
        
        Originator originaltor1 = new Originator("Stage 1 - Prologue");
        Originator originaltor2 = new Originator("Stage 2 - City Ruins");
        Originator originaltor3 = new Originator("Stage 3 - Abandoned Factory");
        Originator originaltor4 = new Originator("Stage 4 - Sunken Glades");

        caretaker.storeMemento(originaltor1.createMemento(), 1);
        caretaker.storeMemento(originaltor2.createMemento(), 2);
        caretaker.storeMemento(originaltor3.createMemento(), 3);
        caretaker.storeMemento(originaltor4.createMemento(), 1);

        Memento restoredMemento1 = caretaker.restoreMemento(1);
        System.out.println(restoredMemento1);
        Memento restoredMemento2 = caretaker.restoreMemento(2);
        System.out.println(restoredMemento2);
    }
}