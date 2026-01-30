package Strategy.SpotAllocationStrategy;

import Models.ParkingSpot;

import java.util.List;

import Models.ParkingFloor;
import Models.Vehicle.Vehicle;

public class NearestSpotStrategy implements SpotAllocationStrategy {

    private List<ParkingFloor> parkingFloors;
    private ParkingFloor nearestFloorAvailable;
    private ParkingSpot nearestSpotAvailable;

    public NearestSpotStrategy(List<ParkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }

    @Override
    public void allocateSpot(Vehicle vehicle) {
        for (ParkingFloor parkingFloor : parkingFloors) {
            ParkingSpot parkingSpot = parkingFloor.getAvailableSpot(vehicle);
            if (parkingSpot != null) {
                nearestFloorAvailable = parkingFloor;
                nearestSpotAvailable = parkingSpot;
                return;
            }
        }
    }

    @Override
    public ParkingFloor getParkingFloor() {
        return nearestFloorAvailable;
    }

    @Override
    public ParkingSpot getParkingSpot() {
        return nearestSpotAvailable;
    }

}
