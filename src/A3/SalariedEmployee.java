package A3;

public class SalariedEmployee extends Employee implements Payable{
    public SalariedEmployee(String name, int id) {
        super(name, id);
    }

    @Override
    public double calculatePay() {
        double salary = 99000;

        return salary / 12;
    }

    @Override
    public String getPayDetails() {

        return "Employee " + getName() + " is paid " + calculatePay();
    }



}
