package com.careerdevs;
import java.util.Scanner;
public class RentalService {
    public static void main(String[] args) {

            System.out.println("Welcome to the Car Rental CLI.");

            Scanner scanner = new Scanner(System.in);
            System.out.println("what is the make of the car?\nEnter here:");
            String make = scanner.nextLine();

            System.out.println("What model is the car?\n Enter here:");
            String model = scanner.nextLine();

            System.out.println("has the car been rented?\n Enter true or false here:");
            boolean isRented = scanner.nextBoolean();

            RentalService userGeneratedRental = new RentalService()
            System.out.println(userGeneratedRental);

    }
}
