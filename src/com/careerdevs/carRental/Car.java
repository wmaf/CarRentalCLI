package com.careerdevs.carRental;

public class Car {
    private String carMake;
    private String carModel;
    private boolean isRented;

    public Car (String carMake, String carModel) {
        this.carMake = carMake;
        this.carModel = carModel;
        this.isRented = false;

    }

    public String getcarMake() {
        return carMake;
    }

    public String getcarModel() {
        return carModel;
    }

    public boolean isRented() {
        return isRented;
    }
    //Setter
    public void setRented(boolean rented) {
        isRented = rented;
    }


    //pt  gets public to string.
    @Override
    public String toString() {
        return "Car{" +
                "carMake='" + carMake + '\'' +
                ", carModel='" + carModel + '\'' +
                ", isRented=" + isRented +
                '}';
    }
}



































//
////    public String getMake(){
////        return make;
////    }
////
////    public String getModel() {
////        return model;
////    }
////
////   public String combineName(){
////        return make +" " + model;
////    }
//
//    public String getMake() {
//        return make;
//    }
//
//    public String getModel() {
//        return model;
//    }
//
//    public boolean isRented() {
//        return isRented;
//    }
//
////    @Override
////    public String toString() {
////        return "Car{" +
////                "make='" + make + '\'' +
////                ", model='" + model + '\'' +
////                ", isRented=" + isRented +
////                '}';
////  }
//}
