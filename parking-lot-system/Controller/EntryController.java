package Controller;

import java.util.List;

import Models.ParkingFloor;
import Models.Ticket;
import Models.Vehicle.Vehicle;
import Service.EntryService;

public class EntryController {

    private final EntryService entryService;

    public EntryController(EntryService entryService) {
        this.entryService = entryService;
    }

    public Ticket enterVehicle(Vehicle vehicle, List<ParkingFloor> parkingFloors) {
        return entryService.enterVehicle(vehicle, parkingFloors);
    }

}
