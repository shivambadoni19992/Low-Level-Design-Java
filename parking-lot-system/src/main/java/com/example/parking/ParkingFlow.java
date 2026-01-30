
package com.example.parking;

public abstract class ParkingFlow {
    protected Ticket processEntry(Vehicle v) {
        return allocate(v);
    }

    protected abstract Ticket allocate(Vehicle v);
    protected abstract double calculateFee(Ticket t);
}
