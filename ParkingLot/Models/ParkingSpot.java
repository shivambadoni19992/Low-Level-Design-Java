package Models;

import Enums.SpotType;
import Models.Vehicle.Vehicle;

public abstract class ParkingSpot {
    private int spotNumber;
    private SpotType spotType;
    private Vehicle vehicle;

    public ParkingSpot(int spotNumber, SpotType spotType) {
        this.spotNumber = spotNumber;
        this.spotType = spotType;
    }

    public int getSpotNumber() {
        return spotNumber;
    }

    public SpotType getSpotType() {
        return spotType;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void assignVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void unassignVehicle() {
        this.vehicle = null;
    }

    public boolean isAvailable() {
        return vehicle == null;
    }

    public boolean canFitVehicle(Vehicle vehicle) {
        return vehicle.spotTypeRequired() == spotType;
    }

}
