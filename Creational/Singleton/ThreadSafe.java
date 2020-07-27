package Creational.Singleton;

// Using synchronized makes sure that only one thread at a time can execute getInstance().
// The main disadvantage of this is method is that using synchronized every time while 
// creating the singleton object is expensive and may decrease the performance of your program.
// However if performance of getInstance() is not critical for your application 
// this method provides a clean and simple solution.
public class ThreadSafe {
    
    // the volatile modifier guarantees that any thread that reads a field
    // will see the most recently written value.
    private static ThreadSafe instance; // volatile modifier is optional here
 
    private ThreadSafe() {}
 
    public static synchronized ThreadSafe getInstance() {
        if (instance == null) {
            instance = new ThreadSafe();
        }
        return instance;
    }
}