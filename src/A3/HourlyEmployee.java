package A3;
/// uses fields name and id
/// implements abstract methods from Payable for Pay and pay details

public class HourlyEmployee extends Employee implements Payable{

    private double payRate = 18.50;
    private double hoursWorked = 24;
    public HourlyEmployee(String name, int id) {
        super(name, id);
    }


    // hours worked at the pay rate is returned
    @Override
    public double calculatePay() {
        return hoursWorked * payRate;
    }

    @Override
    public String getPayDetails() {
        return "Employee " + getName() + " is paid hourly: " + this.payRate + calculatePay();
    }


}
