package Behavioral.Observer;

import Behavioral.Observer.Observer.StockObserver;
import Behavioral.Observer.Subject.StockGrabberSubject;

public class GrabStock {
    
    public static void main(String []args) {

        StockGrabberSubject stockGrabber = new StockGrabberSubject();

        StockObserver observer1 = new StockObserver(stockGrabber);
        stockGrabber.setIbmPrice(10.5);
        stockGrabber.setApplePrice(23.4);
        stockGrabber.setGooglePrice(16.8);
        stockGrabber.unregister(observer1);

        StockObserver observer2 = new StockObserver(stockGrabber);
        // stockGrabber.setIbmPrice(10.5);
        // stockGrabber.setApplePrice(23.4);
        // stockGrabber.setGooglePrice(16.8);

        Runnable getIbm = new GetTheStock(stockGrabber, "ibm", 2, 10.5);
        Runnable getApple = new GetTheStock(stockGrabber, "apple", 4, 23.4);
        Runnable getGoogle = new GetTheStock(stockGrabber, "google", 8, 16.8);

        new Thread(getIbm).start();
        new Thread(getApple).start();
        new Thread(getGoogle).start();
    }
}