package Structural.Facade.Services;

import Structural.Facade.Builder.ServiceTypes.PaymentType;

public class PaymentService {
    
    public void showType(PaymentType paymentType) {
        System.out.println("PaymentType: " + paymentType);
    }

    // ... More logic down here
}