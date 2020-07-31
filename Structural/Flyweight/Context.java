package Structural.Flyweight;

/**
 * Extrinsic State
 */
public class Context {
    
    private int id;
    private int kills;

    public Context(int id, int kills) {
        this.id = id;
        this.kills = kills;
    }

    public boolean isPromoted() {
        if (kills >= 10) {
            return true;
        }
        return false;
    }

    public int getId() {
        return this.id;
    }
}