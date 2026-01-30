package Models.Vehicle;

import Enums.SpotType;

public class Bike extends Vehicle {

    public Bike(String vehicleNumber) {
        super(vehicleNumber);
    }

    @Override
    public Vehicle getVehicleType() {
        return this;
    }

    @Override
    public SpotType spotTypeRequired() {
        return SpotType.SMALL;
    }

    @Override
    public int getHourlyRate() {
        return 10;
    }

}
