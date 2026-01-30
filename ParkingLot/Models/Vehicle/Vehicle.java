package Models.Vehicle;

import Enums.SpotType;

public abstract class Vehicle {
    private String vehicleNumber;

    public Vehicle(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public abstract Vehicle getVehicleType();

    public abstract SpotType spotTypeRequired();
}
