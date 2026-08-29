package A3;

public class HourlyEmployee extends Employee implements Payable{
    public HourlyEmployee(String name, int id) {
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
