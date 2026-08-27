package A4;

public class Truck extends Vehicle implements Rentable{


    public Truck(String make, String model, int year, double dailyRate) {
        super(make, model, year, dailyRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return 0;
    }

    @Override
    public String getRentalTerms() {
        return "";
    }



}


/*

Each of these should extend Vehicle and implement Rentable.
Each subclass needs its own version of calculateRentalCost that reflects a realistic pricing rule for that vehicle — for example,
a truck might charge a higher daily rate plus a flat mileage fee,
while a motorcycle might charge a lower daily rate but add a mandatory insurance fee.
Each subclass also needs its own version of getRentalTerms describing the conditions that apply to that vehicle type.

 */
