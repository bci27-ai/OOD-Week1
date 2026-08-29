package A3;

public class SalariedEmployee extends Employee implements Payable{
    public SalariedEmployee(String name, int id) {
        super(name, id);
    }

    @Override
    public double calculatePay() {
        return 0;
    }

    @Override
    public String getPayDetails() {
        return "";
    }



}
