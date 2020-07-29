package Structural.Facade;

import Structural.Facade.Builder.ServiceTypes.BookingType;
import Structural.Facade.Builder.ServiceTypes.PaymentType;
import Structural.Facade.Services.*;

public class HotelServiceFacade {

    private static volatile HotelServiceFacade instance = new HotelServiceFacade();

    private BookingService bookingService;
    private EmailService emailService;
    private PaymentService paymentService;

    private BookingType bookingType;
    private PaymentType paymentType;
    private String email;

    // public HotelServiceFacade(BookingType bookingType, PaymentType paymentType, String email) {

    //     this.bookingService = new BookingService();
    //     this.paymentService = new PaymentService();
    //     this.emailService = new EmailService();

    //     this.bookingType = bookingType;
    //     this.paymentType = paymentType;
    //     this.email = email;
    // }

    public HotelServiceFacade() {
        this.bookingService = new BookingService();
        this.paymentService = new PaymentService();
        this.emailService = new EmailService();
    }

    public void setBookingType(BookingType bookingType) {
        this.bookingType = bookingType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static HotelServiceFacade getInstance() {
        if (instance == null) {
            synchronized (HotelServiceFacade.class) {
                if (instance == null) {
                    instance = new HotelServiceFacade();
                }
            }
        }
        return instance;
    }

    @Override
    public String toString() {
        return "Email: " + email + " [bookingType=" + bookingType + ", paymentType=" + paymentType + "]";
    }

    public void showReceipt() {
        bookingService.showType(bookingType);
        paymentService.showType(paymentType);
        emailService.sendEmail(email);
    }
}