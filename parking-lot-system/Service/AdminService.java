package Service;

import Repository.AdminRepository;
import Models.ParkingFloor;
import Models.ParkingSpot;

public class AdminService {
    private final AdminRepository adminRepository;

    public AdminService(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    public ParkingFloor getParkingFloor() {
        return adminRepository.getParkingFloor();
    }

    public void createParkingFloor(int floors) {
        adminRepository.createParkingFloor(floors);
    }

    public void addParkingSpot(ParkingFloor parkingFloor, ParkingSpot parkingSpot) {
        adminRepository.addParkingSpot(parkingFloor, parkingSpot);
    }

    public void removeParkingSpot(ParkingFloor parkingFloor, ParkingSpot parkingSpot) {
        adminRepository.removeParkingSpot(parkingFloor, parkingSpot);
    }

}
