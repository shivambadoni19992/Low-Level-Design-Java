
package com.example.parking;

import java.time.Instant;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class TicketRepository {
    private final AtomicInteger seq = new AtomicInteger();
    private final ConcurrentHashMap<Integer, Ticket> store = new ConcurrentHashMap<>();

    public Ticket save(Vehicle v) {
        Ticket t = new Ticket(seq.incrementAndGet(), v, seq.get(), Instant.now());
        store.put(t.getId(), t);
        return t;
    }

    public Ticket remove(int id) {
        return store.remove(id);
    }
}
