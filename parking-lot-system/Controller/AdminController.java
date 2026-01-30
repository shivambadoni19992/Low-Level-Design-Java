package Controller;

import Models.ParkingFloor;
import Models.ParkingSpot;
import Service.AdminService;

public class AdminController {
    private AdminService adminService;

    public AdminController() {
        this.adminService = new AdminService();
    }

    public void createParkingFloor(int floors) {
        adminService.createParkingFloor(floors);
    }

    public ParkingFloor getParkingFloors() {
        return adminService.getParkingFloors();
    }

    public void addParkingSpot(ParkingFloor parkingFloor, ParkingSpot parkingSpot) {
        adminService.addParkingSpot(parkingFloor, parkingSpot);
    }

    public void removeParkingSpot(ParkingFloor parkingFloor, ParkingSpot parkingSpot) {
        adminService.removeParkingSpot(parkingFloor, parkingSpot);
    }

}
