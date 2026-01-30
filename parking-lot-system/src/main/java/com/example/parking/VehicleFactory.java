
package com.example.parking;

public class VehicleFactory {
    public static Vehicle create(String type, String number) {
        if ("CAR".equalsIgnoreCase(type)) return new Car(number);
        throw new IllegalArgumentException("Unsupported vehicle");
    }
}
