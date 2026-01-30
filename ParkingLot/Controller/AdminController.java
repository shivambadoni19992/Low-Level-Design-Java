package Controller;

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

    public void addParkingSpot(ParkingSpot parkingSpot) {
        adminService.addParkingSpot(parkingSpot);
    }

    public void removeParkingSpot(ParkingSpot parkingSpot) {
        adminService.removeParkingSpot(parkingSpot);
    }

}
