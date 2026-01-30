package Repository;

import Models.ParkingFloor;
import Models.ParkingSpot;

public class AdminRepository {

    ParkingFloor parkingFloor;

    public void createParkingFloor(int floors) {
        parkingFloor = new ParkingFloor(floors);
    }

    public ParkingFloor getParkingFloor() {
        return parkingFloor;
    }

    public void addParkingSpot(ParkingFloor parkingFloor, ParkingSpot parkingSpot) {
        parkingFloor.addParkingSpot(parkingSpot);
    }

    public void removeParkingSpot(ParkingFloor parkingFloor, ParkingSpot parkingSpot) {
        parkingFloor.removeParkingSpot(parkingSpot);
    }
}