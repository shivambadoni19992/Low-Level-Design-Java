package Service;

import java.time.LocalTime;

import Strategy.PricingStrtegy.PricingStrategy;
import Factory.PaymentFactory;
import Models.Receipt;
import Models.Ticket;
import Enums.PaymentType;

public class ExitService {

    private PricingStrategy pricingStrategy;

    public ExitService(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    public Receipt exitVehicle(Ticket ticket, PaymentType paymentType) {
        int price = pricingStrategy.calculatePrice(ticket);
        PaymentFactory.getPaymentStrategy(paymentType).pay(price);
        ticket.getParkingSpot().unassignVehicle();

        return new Receipt(ticket, price, paymentType, "PAID", LocalTime.now().toString());
    }

}
