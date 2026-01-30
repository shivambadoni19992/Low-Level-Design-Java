package Service;

import java.time.LocalTime;

import Strategy.PricingStrtegy.PricingStrategy;
import Strategy.PaymentStrategy.PaymentStrategy;
import Models.Receipt;
import Models.Ticket;

public class ExitService {

    private final PricingStrategy pricingStrategy;

    public ExitService(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    public Receipt exitVehicle(Ticket ticket, PaymentStrategy paymentStrategy) {
        int price = pricingStrategy.calculatePrice(ticket);
        paymentStrategy.pay(price);
        ticket.getParkingSpot().unassignVehicle();

        return new Receipt(ticket, price, paymentStrategy.getPaymentType(), "PAID", LocalTime.now().toString());
    }

}
