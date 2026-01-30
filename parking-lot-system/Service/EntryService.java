package Service;

import java.util.List;

import Models.ParkingFloor;
import Models.ParkingSpot;
import Models.Ticket;
import Models.Vehicle.Vehicle;
import Repository.EntryRepository;
import Strategy.SpotAllocationStrategy.SpotAllocationStrategy;

public class EntryService {

    private final EntryRepository entryRepository;
    private final SpotAllocationStrategy spotAllocationStrategy;

    public EntryService(EntryRepository entryRepository, SpotAllocationStrategy spotAllocationStrategy) {
        this.entryRepository = entryRepository;
        this.spotAllocationStrategy = spotAllocationStrategy;
    }

    public Ticket enterVehicle(Vehicle vehicle, List<ParkingFloor> parkingFloors) {

        spotAllocationStrategy.allocateSpot(vehicle);

        ParkingSpot parkingSpot = spotAllocationStrategy.getParkingSpot();
        ParkingFloor parkingFloor = spotAllocationStrategy.getParkingFloor();

        entryRepository.assignVehicle(parkingSpot, vehicle);
        entryRepository.generateTicket(parkingSpot, vehicle, parkingFloor);

        return entryRepository.getTicket();
    }

}
