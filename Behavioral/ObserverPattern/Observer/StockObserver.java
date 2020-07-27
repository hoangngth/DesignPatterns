package Behavioral.ObserverPattern.Observer;

import Behavioral.ObserverPattern.Subject.Subject;

public class StockObserver implements Observer {

    private double ibmPrice;
    private double applePrice;
    private double googlePrice;
    private static int observerIdTracker = 0;
    private int observerId;

    public StockObserver(Subject stockGrabberSubject) {
        stockGrabberSubject.register(this);
        this.observerId = ++observerIdTracker;
        System.out.printf("Observer #%d Created\n", this.observerId);
    }

    @Override
    public void update(double ibmPrice, double applePrice, double googlePrice) {
        this.ibmPrice = ibmPrice;
        this.applePrice = applePrice;
        this.googlePrice = googlePrice;
        printStockPrice();
    }

    private void printStockPrice() {
        System.out.println("ObserverID: " + this.observerId);
        System.out.println("Ibm: " + ibmPrice);
        System.out.println("Apple: " + applePrice);
        System.out.println("Google: " + googlePrice);
        System.out.println();
    }
    
}