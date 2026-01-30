
package com.example.parking;

import java.time.Duration;
import java.time.Instant;

public class HourlyFeeStrategy implements FeeCalculationStrategy {
    @Override
    public double calculate(Ticket t) {
        long hours = Math.max(1, Duration.between(t.getEntryTime(), Instant.now()).toHours());
        return hours * 50;
    }
}
