package Repository;

import java.sql.Time;

import Models.ParkingFloor;
import Models.ParkingSpot;
import Models.Ticket;
import Models.Vehicle.Vehicle;

public class EntryRepository {
    private Ticket ticket;

    public void assignVehicle(ParkingSpot parkingSpot, Vehicle vehicle) {
        parkingSpot.assignVehicle(vehicle);
    }

    public void generateTicket(ParkingSpot parkingSpot, Vehicle vehicle, ParkingFloor parkingFloor) {
        ticket = new Ticket(vehicle.getVehicleNumber(), parkingSpot, vehicle, parkingFloor,
                new Time(System.currentTimeMillis()));
    }

    public Ticket getTicket() {
        return ticket;
    }

}
