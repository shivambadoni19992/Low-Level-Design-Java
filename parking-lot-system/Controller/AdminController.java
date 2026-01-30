package Controller;

import Models.ParkingFloor;
import Models.ParkingSpot;
import Service.AdminService;

public class AdminController {
    private final AdminService adminService;

    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    public void createParkingFloor(int floors) {
        adminService.createParkingFloor(floors);
    }

    public ParkingFloor getParkingFloor() {
        return adminService.getParkingFloor();
    }

    public void addParkingSpot(ParkingFloor parkingFloor, ParkingSpot parkingSpot) {
        adminService.addParkingSpot(parkingFloor, parkingSpot);
    }

    public void removeParkingSpot(ParkingFloor parkingFloor, ParkingSpot parkingSpot) {
        adminService.removeParkingSpot(parkingFloor, parkingSpot);
    }

}
