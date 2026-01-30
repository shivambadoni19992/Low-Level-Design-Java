
package com.example.parking;

public class FeeStrategyFactory {
    public static FeeCalculationStrategy defaultStrategy() {
        return new HourlyFeeStrategy();
    }
}
