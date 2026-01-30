
package com.example.parking;

public class ParkingLotManager {
    private static final ParkingLotManager INSTANCE = new ParkingLotManager();
    private final ParkingService service = new ParkingService();

    private ParkingLotManager() {}

    public static ParkingLotManager getInstance() {
        return INSTANCE;
    }

    public Ticket park(String type, String number) {
        return service.park(VehicleFactory.create(type, number));
    }

    public double exit(int ticketId) {
        return service.exit(ticketId);
    }
}
