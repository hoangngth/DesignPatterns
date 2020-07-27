package Creational.Singleton;

// The main problem with above method is that it is not thread safe.
public class LazyInstantiation {
    
    private static LazyInstantiation instance;

    private LazyInstantiation() {}

    public static LazyInstantiation getInstance() {
        if (instance == null) {
            instance = new LazyInstantiation();
        }
        return instance;
    }
}