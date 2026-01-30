
package com.example.parking;

import java.util.concurrent.locks.ReentrantLock;

public class ParkingService extends ParkingFlow {
    private final ReentrantLock lock = new ReentrantLock();
    private final TicketRepository repo = new TicketRepository();

    @Override
    protected Ticket allocate(Vehicle v) {
        return repo.save(v);
    }

    @Override
    protected double calculateFee(Ticket t) {
        return FeeStrategyFactory.defaultStrategy().calculate(t);
    }

    public Ticket park(Vehicle v) {
        lock.lock();
        try {
            return processEntry(v);
        } finally {
            lock.unlock();
        }
    }

    public double exit(int ticketId) {
        lock.lock();
        try {
            Ticket t = repo.remove(ticketId);
            return calculateFee(t);
        } finally {
            lock.unlock();
        }
    }
}
