package Strategy.PricingStrtegy;

import java.time.LocalTime;

import Models.Ticket;

public class HourlyRateStrategy implements PricingStrategy {
    @Override
    public int calculatePrice(Ticket ticket) {

        LocalTime entryTime = LocalTime.parse(ticket.getEntryTime());
        LocalTime exitTime = LocalTime.now().plusHours(2);
        int timeDiff = exitTime.getHour() - entryTime.getHour();
        return ticket.getVehicle().getVehicleType().getHourlyRate() * timeDiff;
    }
}
