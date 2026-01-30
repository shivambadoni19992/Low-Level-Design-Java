package Models;

import java.sql.Time;

import Models.Vehicle.Vehicle;

public class Ticket {
    private String ticketNumber;
    private ParkingSpot parkingSpot;
    private Vehicle vehicle;
    private ParkingFloor parkingFloor;
    private Time entryTime;

    public Ticket(String ticketNumber, ParkingSpot parkingSpot, Vehicle vehicle, ParkingFloor parkingFloor,
            Time entryTime) {
        this.ticketNumber = ticketNumber;
        this.parkingSpot = parkingSpot;
        this.vehicle = vehicle;
        this.parkingFloor = parkingFloor;
        this.entryTime = entryTime;
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
