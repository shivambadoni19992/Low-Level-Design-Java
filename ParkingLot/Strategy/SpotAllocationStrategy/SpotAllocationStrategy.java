package Strategy.SpotAllocationStrategy;

import Models.ParkingFloor;
import Models.ParkingSpot;
import Models.Vehicle.Vehicle;

public interface SpotAllocationStrategy {
    public void allocateSpot(Vehicle vehicle);

    public ParkingSpot getParkingSpot();

    public ParkingFloor getParkingFloor();
}
