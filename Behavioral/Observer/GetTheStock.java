package Behavioral.Observer;

import Behavioral.Observer.Subject.StockGrabberSubject;
import Behavioral.Observer.Subject.Subject;

public class GetTheStock implements Runnable {

    private String name;
    private int updateTime;
    private double price;
    private Subject stockGrabber;

    public GetTheStock(Subject stockGrabber, String name, int updateTime, double startPrice) {
        this.stockGrabber = stockGrabber;
        this.name = name;
        this.updateTime = updateTime;
        this.price = startPrice;
    }

    @Override
    public void run() {
        while(true) {

            try {
                Thread.sleep(updateTime * 1000);
            } catch(InterruptedException e) {}

            double randNum = (Math.random() * (1.0)) - .5;
            price += randNum;
            System.out.printf("%s has new price: %f", name, price);
            if (name == "ibm") ((StockGrabberSubject)stockGrabber).setIbmPrice(price);
            if (name == "apple") ((StockGrabberSubject)stockGrabber).setApplePrice(price);
            if (name == "google") ((StockGrabberSubject)stockGrabber).setGooglePrice(price);
        }
       
    }
    
}