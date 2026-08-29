package A3;

import java.util.ArrayList;

public class PayrollSystem {

    private ArrayList<Payable> emp;

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
}

/*

write a PayrollSystem class that stores a list of Payable objects.
This class needs a method called processPayroll that loops through every employee and prints their pay details,
    along with a method called totalPayrollCost that adds up the result of calculatePay across the entire list.

 */
