package Service;

import java.util.List;

import Models.ParkingFloor;
import Models.ParkingSpot;
import Models.Ticket;
import Models.Vehicle.Vehicle;
import Repository.EntryRepository;
import Strategy.SpotAllocationStrategy.NearestSpotStrategy;
import Strategy.SpotAllocationStrategy.SpotAllocationStrategy;

public class EntryService {

    private EntryRepository entryRepository;

    public EntryService() {
        this.entryRepository = new EntryRepository();
    }

    public Ticket enterVehicle(Vehicle vehicle, List<ParkingFloor> parkingFloors) {

        SpotAllocationStrategy spotAllocationStrategy = new NearestSpotStrategy(parkingFloors);
        spotAllocationStrategy.allocateSpot(vehicle);

        ParkingSpot parkingSpot = spotAllocationStrategy.getParkingSpot();
        ParkingFloor parkingFloor = spotAllocationStrategy.getParkingFloor();

        entryRepository.assignVehicle(parkingSpot, vehicle);
        entryRepository.generateTicket(parkingSpot, vehicle, parkingFloor);

        return entryRepository.getTicket();
    }

}
