package Models;

import java.time.LocalTime;

import Models.Vehicle.Vehicle;

public class Ticket {
    private String ticketNumber;
    private ParkingSpot parkingSpot;
    private Vehicle vehicle;
    private ParkingFloor parkingFloor;
    private LocalTime entryTime;

    public Ticket(ParkingSpot parkingSpot, Vehicle vehicle, ParkingFloor parkingFloor,
            LocalTime entryTime) {

        this.parkingSpot = parkingSpot;
        this.vehicle = vehicle;
        this.parkingFloor = parkingFloor;
        this.entryTime = entryTime;
        this.ticketNumber = generateTicketNumber();
    }

    public String generateTicketNumber() {
        return parkingFloor.getFloorNumber() + "-" + parkingSpot.getSpotNumber() + "-" + vehicle.getVehicleNumber()
                + "-" + entryTime.toString();
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public ParkingFloor getParkingFloor() {
        return parkingFloor;
    }

    public String getEntryTime() {
        return entryTime.toString();
    }

}
