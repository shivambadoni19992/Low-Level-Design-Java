package Models.Vehicle;

import Enums.SpotType;

public class Truck extends Vehicle {
    public Truck(String vehicleNumber) {
        super(vehicleNumber);
    }

    @Override
    public Vehicle getVehicleType() {
        return this;
    }

    @Override
    public SpotType spotTypeRequired() {
        return SpotType.LARGE;
    }

    @Override
    public int getHourlyRate() {
        return 50;
    }
}
