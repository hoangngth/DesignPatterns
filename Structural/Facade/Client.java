package Structural.Facade;

import Structural.Facade.Builder.HotelServiceReceiptBuilder;
import Structural.Facade.Builder.ServiceTypes.BookingType;
import Structural.Facade.Builder.ServiceTypes.PaymentType;

public class Client {
    
    public static void main(String[] args) {

        HotelServiceFacade hotelServiceFacade = new HotelServiceReceiptBuilder()
                    .setBooking(BookingType.ONLINE)
                    .setPayment(PaymentType.BANK)
                    .setEmail("hoang.nth1996@gmail.com")
                    .build();
        System.out.println(hotelServiceFacade);
        hotelServiceFacade.showReceipt();
    }
}