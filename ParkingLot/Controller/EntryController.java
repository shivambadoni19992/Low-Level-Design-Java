package Controller;

import java.util.List;

import Models.ParkingFloor;
import Models.Ticket;
import Models.Vehicle.Vehicle;
import Service.EntryService;

public class EntryController {

    private EntryService entryService;

    public EntryController() {
        this.entryService = new EntryService();
    }

    public Ticket parkVehicle(Vehicle vehicle, List<ParkingFloor> parkingFloors) {
        return entryService.parkVehicle(vehicle, parkingFloors);
    }

}
