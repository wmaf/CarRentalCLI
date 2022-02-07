package com.careerdevs;

public class Car {
    private String make;
    private String model;
    private boolean isRented;

    //public Car( String make, String model, boolean isRented) {
    public Car( String make, String model){
        this.make = make;
        this.model = model;
        this.isRented = false;
    }

//    public String getMake(){
//        return make;
//    }
//
//    public String getModel() {
//        return model;
//    }
//
//   public String combineName(){
//        return make +" " + model;
//    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public boolean isRented() {
        return isRented;
    }

//    @Override
//    public String toString() {
//        return "Car{" +
//                "make='" + make + '\'' +
//                ", model='" + model + '\'' +
//                ", isRented=" + isRented +
//                '}';
//  }
}
