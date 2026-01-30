package Strategy.PricingStrtegy;

import Models.Ticket;

public interface PricingStrategy {
    public int calculatePrice(Ticket ticket);
}
