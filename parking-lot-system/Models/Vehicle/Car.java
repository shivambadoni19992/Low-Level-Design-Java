package Models.Vehicle;

import Enums.SpotType;

public class Car extends Vehicle {
    public Car(String vehicleNumber) {
        super(vehicleNumber);
    }

    @Override
    public Vehicle getVehicleType() {
        return this;
    }

    @Override
    public SpotType spotTypeRequired() {
        return SpotType.MEDIUM;
    }

    @Override
    public int getHourlyRate() {
        return 20;
    }
}
