package Behavioral.Memento;

public class Memento {

    private String stage;

    public Memento(String stage) {
        this.setStage(stage);
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    @Override
    public String toString() {
        return this.stage;
    }
}