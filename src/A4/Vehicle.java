package A4;

public abstract class Vehicle {

    String make;
    String model;
    int year;
    double dailyRate;

    public Vehicle(String make, String model, int year, double dailyRate) {

        this.make = make;
        this.model = model;
        this.year = year;
        this.dailyRate = dailyRate;
    }

    public void displayVehicleInfo(){
        System.out.println("Make: ", "Model: " + "Year: " + "DailyRate: " + );
    }

    // no methods then... ??
    //public abstract
}

/*
 students should write an abstract Vehicle class
    - holds the fields shared by every vehicle in the fleet,
    - specifically make, model, year, and dailyRate.

     This class should include a constructor that sets all four fields and a concrete method called displayVehicleInfo that prints them.
Vehicle doesn't implement calculateRentalCost or getRentalTerms from the Rentable Interface
- those behaviors come from the Rentable interface and need to differ from one vehicle type to the next.

 */

