package Behavioral.Observer.Subject;

import Behavioral.Observer.Observer.Observer;

public interface Subject {
    public void register(Observer obs);
    public void unregister(Observer obs);
    public void notifyObserver();
}