package A4;

import java.util.ArrayList;

public class RentalCompany {

    //Car car = new Car("Toy-Yoda", "Camry",2012,250);

    // creating a Vehicle list with vehicle as the type hoping to be able to fit all vehicle types easily.

    private ArrayList <Vehicle> Fleet = new ArrayList <> ();

    public void addVehicleToFleet(Vehicle vehicle){
        Fleet.add(vehicle);
    }

    public void displayFleet(){

        for (Vehicle v : Fleet){
            System.out.println(v.toString());

        }
        //System.out.println(Fleet.);
    }

    // display terms for all vehicles in the fleet.
    // using the class as objects to display the terms directly instead of needing an object...

    public void displayAllRentalTerms( Car c, Truck t, Motorcycle m ){
        c.getRentalTerms();
        t.getRentalTerms();
        m.getRentalTerms();

    }

    public ArrayList<Vehicle> getFleet(){
        return Fleet;
    }
}

/*

write a RentalCompany class that
    stores a list of vehicles representing its fleet.

    This class needs:
        a method called addVehicleToFleet,
        a method called displayFleet that prints information about every vehicle in the fleet,
        a method called displayAllRentalTerms that prints the rental terms for every vehicle in the fleet.

        Because each vehicle type implements getRentalTerms differently,
        this last method is where students will see the same method
        call produce different results depending on the object's actual type.
 */