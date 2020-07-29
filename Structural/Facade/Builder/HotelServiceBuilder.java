package Structural.Facade.Builder;

import Structural.Facade.HotelServiceFacade;
import Structural.Facade.Builder.ServiceTypes.*;

public interface HotelServiceBuilder {
    public HotelServiceBuilder setBooking(BookingType bookingType);
    public HotelServiceBuilder setPayment(PaymentType paymentType);
    public HotelServiceBuilder setEmail(String email);
    public HotelServiceFacade build();
}