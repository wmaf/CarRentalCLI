package com.careerdevs.carRental;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RentalService {
    private static ArrayList<Car> carStorage;
    public static void main(String[] args) {
        initializeCarStorage();
        //carStorage.get(0).setRented(true);  //test/set  boolean    to true/false
        mainMenu();
    }


    private static ArrayList<Car> filterCars(boolean filterRented) {
        return carStorage.stream().filter(car -> !car.isRented()).collect(Collectors.toCollection(ArrayList::new));
    }
    public static ArrayList<Car> getAvailableCars(){
        return null;
}



    private static void mainMenu() {
        System.out.println("\nRENTAL MENU\n");
        int listNumber = 1;
        for (int i = 0; i < carStorage.size(); i++) {
            if ( !carStorage.get(i).isRented() ) {
                System.out.println(listNumber + ") " + carStorage.get(i).getName());  //may have an issue here
                listNumber ++;
            }
        }
    }

    private static void initializeCarStorage() {

        carStorage = new ArrayList<>();
//@60:30

        Car car1 = new Car("Honda", "Accord",1);
        Car car2 = new Car("Chevy", "Cruze",2);
        Car car3 = new Car("Toyota","Corolla",3);
        Car car4 = new Car("Chevy", "Volt",4);
        Car car5 = new Car("Toyota","Rav4",5);
        Car car6 = new Car("Chevy", "Camaro",6);

        carStorage.addAll(List.of(new Car[]{car1,car2,car3,car4,car5,car6}));

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
