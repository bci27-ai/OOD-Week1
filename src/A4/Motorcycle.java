package A4;

/// contains vehicle related fields,
/// super for vehicle fields in constructor.
///
/// overridden rental terms and cost calc for Motorcycle specifics

public class Motorcycle extends Vehicle implements Rentable {


    public Motorcycle(String make, String model, int year, double dailyRate) {
        super(make, model, year, dailyRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        double insurance = 10.50;

        return dailyRate * days + insurance;
    }

    @Override
    public String getRentalTerms() {
        return "Motorcycle rentee pays for insurance, and a daily rate of: " + dailyRate + " per day";
    }

}

/*

Each of these should extend Vehicle and implement Rentable.
Each subclass needs its own version of calculateRentalCost that reflects a realistic pricing rule for that vehicle —
truck might charge a higher daily rate plus a flat mileage fee,
motorcycle might charge a lower daily rate but add a mandatory insurance fee.
Each subclass also needs its own version of getRentalTerms describing the conditions that apply to that vehicle type.

 */


