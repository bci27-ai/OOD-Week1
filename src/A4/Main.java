package A4;

public class Main {




}


/*
Students will build a system for a vehicle rental company that manages a fleet of vehicles,
rents them to customers, and calculates rental costs based on the type of vehicle.

The first piece students should write is a Rentable interface with two methods:
    - calculateRentalCost, which takes a number of days and returns a double, and
    - getRentalTerms, which returns a String describing any special conditions of the rental, such as mileage limits or late fees.

Next, students should write an abstract Vehicle class
    - holds the fields shared by every vehicle in the fleet,
    - specifically make, model, year, and dailyRate.

    This class should include a constructor that sets all four fields and a concrete method called displayVehicleInfo that prints them.
Vehicle should not implement calculateRentalCost or getRentalTerms,

    since those behaviors come from the Rentable interface and need to differ from one vehicle type to the next.

Students should then write three subclasses:
Car, Truck, and Motorcycle.
Each of these should extend Vehicle and implement Rentable.
Each subclass needs its own version of calculateRentalCost that reflects a realistic pricing rule for that vehicle — for example,
a truck might charge a higher daily rate plus a flat mileage fee, while a motorcycle might charge a lower daily rate but add a mandatory insurance fee.
Each subclass also needs its own version of getRentalTerms describing the conditions that apply to that vehicle type.

After the vehicle classes are done, students should write a Customer class that stores a name and a rental history, which should be a list of Vehicle objects the customer has rented. This class needs a method called rentVehicle that adds a vehicle to that history, and a method called getTotalSpent that takes a number of days and adds up the rental cost of every vehicle in the customer's history using the Rentable interface.

Students should also write a RentalCompany class that stores a list of vehicles representing its fleet. This class needs a method called addVehicleToFleet, a method called displayFleet that prints information about every vehicle in the fleet, and a method called displayAllRentalTerms that prints the rental terms for every vehicle in the fleet. Because each vehicle type implements getRentalTerms differently, this last method is where students will see the same method call produce different results depending on the object's actual type.

Finally, students should write a test class that builds a rental company, adds at least one car, one truck, and one motorcycle to the fleet, creates a customer, rents several vehicles to that customer, and prints out how much the customer has spent for a given number of rental days. As with the earlier assignments, every class and interface should be written in its own file.




 */
