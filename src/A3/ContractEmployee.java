package A3;

public class ContractEmployee extends Employee implements Payable{
    public ContractEmployee(String name, int id) {
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
/*
ContractEmployee.

Each of these classes should extend Employee and implement Payable.
Each one needs to implement calculatePay and getPayDetails
    in a way that reflects how that type of employee is actually paid — for instance,
    a salaried employee's pay might be their annual salary divided by twelve,

an hourly employee's pay might be hours worked multiplied by an hourly rate, and
-a contract employee might simply be paid a flat fee.
 */
