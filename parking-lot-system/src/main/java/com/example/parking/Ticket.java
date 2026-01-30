
package com.example.parking;

import java.time.Instant;

public class Ticket {
    private final int id;
    private final Vehicle vehicle;
    private final int slotId;
    private final Instant entryTime;

    public Ticket(int id, Vehicle v, int slotId, Instant time) {
        this.id = id;
        this.vehicle = v;
        this.slotId = slotId;
        this.entryTime = time;
    }

    public int getId() { return id; }
    public int getSlotId() { return slotId; }
    public Instant getEntryTime() { return entryTime; }
}
