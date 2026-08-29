package A3;

import java.util.ArrayList;

public class PayrollSystem {

    private ArrayList<Employee> emp;

    public void processPayroll(){
        for(Employee e : emp){
            e.displayInfo();


        }
    }

    public void totalPayrollCost(){
        for(Employee p : emp){
            p.

        }
    }
}

/*

write a PayrollSystem class that stores a list of Payable objects.
This class needs a method called processPayroll that loops through every employee and prints their pay details,
    along with a method called totalPayrollCost that adds up the result of calculatePay across the entire list.

 */
