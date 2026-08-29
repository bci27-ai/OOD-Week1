package A3;

public class HourlyEmployee extends Employee implements Payable{

    private double payRate = 18.50;
    private double hoursWorked = 24;
    public HourlyEmployee(String name, int id) {
        super(name, id);
    }


    @Override
    public double calculatePay() {
        return hoursWorked * payRate;
    }

    @Override
    public String getPayDetails() {
        return "Employee " + getName() + " is paid hourly: " + this.payRate + calculatePay();
    }


}
