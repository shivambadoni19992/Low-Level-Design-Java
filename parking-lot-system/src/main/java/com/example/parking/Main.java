
package com.example.parking;

public class Main {
    public static void main(String[] args) {
        ParkingLotManager manager = ParkingLotManager.getInstance();
        Ticket ticket = manager.park("CAR", "KA-01-AA-1111");
        System.out.println("Slot: " + ticket.getSlotId());
        System.out.println("Fee: " + manager.exit(ticket.getId()));
    }
}
