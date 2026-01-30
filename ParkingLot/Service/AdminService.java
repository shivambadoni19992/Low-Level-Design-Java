package Service;

import Repository.AdminRepository;
import Models.ParkingSpot;

public class AdminService {
    private AdminRepository adminRepository;

    public AdminService() {
        this.adminRepository = new AdminRepository();
    }

    public void createParkingFloor(int floors) {
        adminRepository.createParkingFloor(floors);
    }

    public void addParkingSpot(ParkingSpot parkingSpot) {
        adminRepository.addParkingSpot(parkingSpot);
    }

    public void removeParkingSpot(ParkingSpot parkingSpot) {
        adminRepository.removeParkingSpot(parkingSpot);
    }

}
