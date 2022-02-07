package com.careerdevs;

public class Vehicle {
    private String make;
    private String model;
    private boolean rented;

public Vehicle (String make, String model) {
    this.make = make;
    this.model = model;
    this.rented = false;

    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public boolean isRented() {
        return rented;
    }
}
