package A3;
/// uses fields name and id
/// implements abstract methods from Payable for Pay (Hourly rate) and pay details

public class SalariedEmployee extends Employee implements Payable{

    private double salary;

    public SalariedEmployee(String name, int id) {
        super(name, id);
        this.salary = 99000;
    }

    @Override
    public double calculatePay() {
        return salary / 12;
    }

    @Override
    public String getPayDetails() {

        return "Employee " + getName() + " is paid " + calculatePay();
    }



}
