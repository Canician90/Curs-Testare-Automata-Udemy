package org.example;

public class AutoVehicle extends Vehicle {
    Engine engine;
    double mileage;



    public AutoVehicle(Engine engine) {
        this.engine = engine;
        System.out.println("Custom constructor called");

    }


}
