package A4;

public interface Rentable {

    public double calculateRentalCost(int days);

    public String getRentalTerms();

}

/*
The first piece students should write is a Rentable interface with two methods:
    - calculateRentalCost, which takes a number of days and returns a double, and
    - getRentalTerms, which returns a String describing any special conditions of the rental, such as mileage limits or late fees.

 */
