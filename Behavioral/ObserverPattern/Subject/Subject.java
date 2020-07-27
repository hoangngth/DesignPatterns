package Behavioral.ObserverPattern.Subject;

import Behavioral.ObserverPattern.Observer.Observer;

public interface Subject {
    public void register(Observer obs);
    public void unregister(Observer obs);
    public void notifyObserver();
}