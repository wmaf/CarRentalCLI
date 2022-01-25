package com.careerdevs;

public class RentalService {
        String make;
        String model;
        boolean isRented;

        public RentalService(String make, String model, boolean isRented) {

            this.make = make;
            this.model = model;
            this.isRented = isRented;

        }

    @Override
    public String toString() {
        return "RentalService{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", isRented=" + isRented +
                '}';
    }
}