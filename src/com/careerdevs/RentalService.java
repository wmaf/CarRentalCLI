package com.careerdevs;

public class RentalService {
    public static void main(String[] args) {
            System.out.println("Welcome to Bill's Car Rental Program");
      Car[] carStor = new Car[3];

    Car car1 = new Car("Honda", "Accord");
    Car car2 = new Car("Chevy", "Cruze");
    Car car3 = new Car("Toyota","Corolla");


        carStor[0] = car1;
        carStor[1] = car2;
        carStor[2] = car3;

        car3.setRented(true);

        // now you can >>> create an array list to store you objects.
        // Don't forget to declair the object store'
        System.out.println("Available Cars");
        //int listNumber = 1; >>>>>Good use of a counter for sequentially numbering the list. But, it removes the index.
        for (int i = 0; i < carStor.length; i++) {

            String carStatus;
          if (!carStor[i].isRented()) {
              carStatus = "Available";
          }else{
              carStatus ="unavailable";
          }
            System.out.println( "(" + (i + 1) + ") "  + carStor[i].getMake()+ " " + carStor[i].getModel() + " "+ carStatus);
        }
    }
}

//       ln #11...    System.out.println(car1.getMake()); // test getter
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