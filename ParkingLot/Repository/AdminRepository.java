package Repository;

import Models.ParkingFloor;
import Models.ParkingSpot;

public class AdminRepository {

    ParkingFloor parkingFloor;

    public void createParkingFloor(int floors) {
        parkingFloor = new ParkingFloor(floors);
    }

    public void addParkingSpot(ParkingSpot parkingSpot) {
        parkingFloor.addParkingSpot(parkingSpot);
    }

    public void removeParkingSpot(ParkingSpot parkingSpot) {
        parkingFloor.removeParkingSpot(parkingSpot);
    }
}