package com.careerdevs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RentalService {

    private static ArrayList<Car> carStorage;
    public static void main(String[] args) {
        initializeCarStorage();
        carStorage.get(0).setRented(true);
        carStorage.get(3).setRented(true);

        rentalMenu();
    }


    private static ArrayList<Car> filterCars(boolean filterRented) {
        return carStorage.stream().filter(car -> !car.isRented()).collect(Collectors.toCollection(ArrayList::new));
    }
    public static ArrayList<Car> getAvailableCars(){
        return null;
}

    private static void rentalMenu() {
    }

    private static void initializeCarStorage() {

        carStorage = new ArrayList<>();

        Car car1 = new Car("Honda", "Accord");
        Car car2 = new Car("Chevy", "Cruze");
        Car car3 = new Car("Toyota","Corolla");
        Car car4 = new Car("Chevy", "Volt");
        Car car5 = new Car("Toyota","Rav4");
        Car car6 = new Car("Chevy", "Camaro");

        carStorage.addAll(List.of(new Car[]{car1,car2,car3,car4,car5,car6}))




    }
}



















// ------------Old Code---------------
//       ln #11...    System.out.println(car1.getMake()); // test getter
//       ln #19...    now you can >>> create an array list to store you objects.
//       ln #20...    Don't forget to declair the object store'
//       ln #21...    int listNumber = 1; >>>>>Good use of a counter for sequentially numbering the list. But, it removes the index.
//       ln #23...     if (!carStor[i].isRented())  //freeken cool use of the Not operator here.
//            System.out.println( "(" + listNumber + ") "  + carStor[i].getMake()+ " " + carStor[i].getModel());
//            listNumber++;
// ---------------------old use of Scanner
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
// -------02/14/2020 -----------------------------------
//      System.out.println("Welcome to Bill's Car Rental Program");
//      Car[] carStor = new Car[3];
//
//      Car car1 = new Car("Honda", "Accord");
//      Car car2 = new Car("Chevy", "Cruze");
//      Car car3 = new Car("Toyota","Corolla");
//        carStor[0] = car1;
//        carStor[1] = car2;
//        carStor[2] = car3;
//
//        car3.setRented(true);
//
//        System.out.println("Available Cars");
//
//        for (int i = 0; i < carStor.length; i++) {
//            String carStatus;
//          if (!carStor[i].isRented()) {
//              carStatus = "Available";
//          }else{
//              carStatus ="unavailable";
//          }
//            System.out.println( "(" + (i + 1) + ") "  + carStor[i].getcarMake()+ " " + carStor[i].getcarModel() + " "+ carStatus);
//        }
//    }
