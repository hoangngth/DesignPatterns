package Behavioral.Observer.Subject;

import java.util.ArrayList;

import Behavioral.Observer.Observer.Observer;

public class StockGrabberSubject implements Subject {

    private ArrayList<Observer> observers;
    private double ibmPrice;
    private double applePrice;
    private double googlePrice;

    public StockGrabberSubject() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void register(Observer obs) {
        observers.add(obs);
    }

    @Override
    public void unregister(Observer obs) {
        System.out.printf("Observer #%d Deleted\n", observers.indexOf(obs)+1);
        observers.remove(obs);
    }

    @Override
    public void notifyObserver() {  
        for(Observer observer : observers) {
            observer.update(ibmPrice, applePrice, googlePrice);
        }
    }
    
    public void setIbmPrice(double ibmPrice) {
        this.ibmPrice = ibmPrice;
        notifyObserver();
    }

    public void setApplePrice(double applePrice) {
        this.applePrice = applePrice;
        notifyObserver();
    }

    public void setGooglePrice(double googlePrice) {
        this.googlePrice = googlePrice;
        notifyObserver();
    }
}