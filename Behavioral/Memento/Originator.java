package Behavioral.Memento;

public class Originator {

    private String stage;

    public Originator(String action) {
        this.setAction(action);
    }

    public String getAction() {
        return stage;
    }

    public void setAction(String stage) {
        this.stage = stage;
    }

    public Memento createMemento() {
        return new Memento(stage);
    }

    public void restore(Memento memento) {
        this.stage = memento.getStage();
    }

    @Override
    public String toString() {
        return this.stage;
    }
}