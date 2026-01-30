package Repository;

import java.time.LocalTime;

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
        ticket = new Ticket(parkingSpot, vehicle, parkingFloor,
                LocalTime.now());
    }

    public Ticket getTicket() {
        return ticket;
    }

}
