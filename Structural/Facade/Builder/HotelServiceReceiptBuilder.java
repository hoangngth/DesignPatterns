package Structural.Facade.Builder;

import Structural.Facade.HotelServiceFacade;
import Structural.Facade.Builder.ServiceTypes.*;

public class HotelServiceReceiptBuilder implements HotelServiceBuilder {

    private BookingType bookingType;
    private PaymentType paymentType;
    private String email;

    @Override
    public HotelServiceBuilder setBooking(BookingType bookingType) {
        this.bookingType = bookingType;
        return this;
    }

    @Override
    public HotelServiceBuilder setPayment(PaymentType paymentType) {
        this.paymentType = paymentType;
        return this;
    }

    @Override
    public HotelServiceBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    // @Override
    // public HotelServiceFacade build() {
    //     return new HotelServiceFacade(bookingType, paymentType, email);
    // }

    @Override
    public HotelServiceFacade build() {
        HotelServiceFacade instance = HotelServiceFacade.getInstance();
        instance.setBookingType(bookingType);
        instance.setPaymentType(paymentType);
        instance.setEmail(email);
        return instance;
    }
    
}