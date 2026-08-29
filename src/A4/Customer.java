package A4;
/// Created customer name, and rent history, using a rentable type
/// calculates all cost based on the loop for calculate cost in child classes

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Rentable> rentalHistory;

    public Customer(String name){
        this.name = name;
        //this.rentalHistory =

    }

    // customre knows what vehicle rent, etc. rent any add to hist, then specify child class
    public void rentVehicle(Rentable rent){
        rentalHistory.add(rent);
    }

    public void getTotalSpent(int days){
        for(Rentable v : rentalHistory){
            v.calculateRentalCost(days);
        }
    }
}

/*
write a Customer class that stores
    a name and
    a rental history,

    which should be a list of Vehicle objects the customer has rented.

    This class needs a method called
        rentVehicle that adds a vehicle to that history, and
        a method called getTotalSpent that takes a number of days and adds up the rental cost
            of every vehicle in the customer's history using the Rentable interface.

 ill keep as is, but i hope this history isnt suppowed to be in the interface...
 nvm fixed it. I get it now.
calc cost is in the interface, so i create the list here, but pass the interface as the type.

 */