package A4;

public class Test {


    public static void main(String[] args) {

        RentalCompany r = new RentalCompany();

        //String make, String model, int year, double dailyRate

        r.addVehicleToFleet(new Car("test Car", "Test Make", 2010, 500.00));
        r.addVehicleToFleet(new Truck("Suzuki", "10Ft", 2005, 700));
        r.addVehicleToFleet(new Motorcycle("Virago", "MotoMake", 1998, 250));

        r.displayFleet();
        //r.displayAllRentalTerms();

        Customer c = new Customer("Jabba the Hut");
        //c.rentVehicle();



        c.getTotalSpent(10);

        // this is what id calla  lazy test. but even though its static it should work fine.



        // specifically for testing
        //Test.run();
    }
}
/*
write a test class that
    builds a rental company,

    adds at least
        one car, truck, motorcycle to the fleet,
        creates a customer,
        rents several vehicles to that customer
        prints out how much the customer has spent
            for a given number of rental days.

As with the earlier assignments, every class and interface should be written in its own file.
 */