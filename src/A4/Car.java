package A4;
/// contains vehicle related fields,
/// super for vehicle fields in constructor.
///
/// overridden rental terms and cost calc for Car specifics


public class Car extends Vehicle implements Rentable{


    public Car(String make, String model, int year, double dailyRate) {
        super(make, model, year, dailyRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        double tollFee = 5.00;

        return (days * dailyRate) * tollFee;
    }

    @Override
    public String getRentalTerms() {
        return "Car rentee pays a flat toll fee, and a daily rate of: " + dailyRate + " per day";
    }
}
