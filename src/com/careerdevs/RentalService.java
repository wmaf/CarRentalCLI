package com.careerdevs;

import java.util.Scanner;
public class RentalService {
    public static void main(String[] args) {
            System.out.println("Welcome to Bill's Car Rental Program");
    Vehicle car1 = new Vehicle("Honda", "Accord");
    Vehicle car2 = new Vehicle("Chevy", "Cruze");
    Vehicle car3 = new Vehicle("Toyota","Corolla");
        System.out.println(car1.getMake());
    }
}





























//
// System.out.println("Welcome to the Car Rental CLI.");
//
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("what is the make of the car?\nEnter here:");
//         String make = scanner.nextLine();
//
//         System.out.println("What model is the car?\n Enter here:");
//         String model = scanner.nextLine();
//
//         System.out.println("has the car been rented?\n Enter true or false here:");
//         boolean isRented = scanner.nextBoolean();
//
//         // Car userGeneratedRental = new Car(make,model,isRented);
//         Car userGeneratedRental = new Car(make,model);
//         System.out.println(userGeneratedRental);