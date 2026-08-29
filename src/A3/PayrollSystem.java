package A3;

import java.util.ArrayList;

public class PayrollSystem {

    private ArrayList<Payable> emp;

    // wasn't sure where to put this, so here it is:
    public void addEmployee(Payable employee){
        emp.add(employee);
    }


    public void processPayroll(){
        for(Payable e : emp){
            e.getPayDetails();
        }
    }

    public void totalPayrollCost(){
        for(Payable p : emp){
            p.calculatePay();

        }
    }

    public void payDetail(){
        for(Payable p : emp){
            p.getPayDetails();

        }
    }

}

/*

write a PayrollSystem class that stores a list of Payable objects.
This class needs a method called processPayroll that loops through every employee and prints their pay details,
    along with a method called totalPayrollCost that adds up the result of calculatePay across the entire list.

 */
