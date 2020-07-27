package Creational.Singleton;

// Once an instance is created synchronization is no longer useful because now instance
// will not be null and any sequence of operations will lead to consistent results.
// So we will only acquire lock on the getInstance() once, when the instance is null.
// This way we only synchronize the first way through
public class DoubleCheckedLocking {
    
    // We declared the instance volatile which ensures that multiple threads offer the
    // instance variable correctly when it is being initialized to DoubleCheckedLocking instance.
    private static volatile DoubleCheckedLocking instance;

    private DoubleCheckedLocking() {}

    public DoubleCheckedLocking getInstance() {

        if (instance == null) {
            // To make thread safe
            synchronized (DoubleCheckedLocking.class) // <- the reason we need volatile 
            { 
                // check again as multiple threads 
                // can reach above step 
                if (instance == null) 
                    instance = new DoubleCheckedLocking(); 
            } 
        }
        return instance;
    }
}