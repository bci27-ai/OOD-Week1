package A3;

import java.util.ArrayList;

public class PayrollSystem {

    private ArrayList<Payable> emp = new ArrayList<>();

    // wasn't sure where to put this, so here it is:
    public void addEmployee(Payable employee){
        emp.add(employee);
    }


    public void processPayroll(){
        for(Payable e : emp){
            //e.getPayDetails();
            System.out.println(e.getPayDetails());
        }
    }

    public void totalPayrollCost(){
        double total = 0;
        for(Payable p : emp){
            //p.calculatePay();
            total += p.calculatePay();
            System.out.println(p.calculatePay());
        }
        System.out.println("Total Cost: " + total);
    }
/*
    public void payDetail(){
        for(Payable p : emp){
            //p.getPayDetails();
            System.out.println(p.calculatePay());

        }


    }
*/
}

/*

write a PayrollSystem class that stores a list of Payable objects.
This class needs a method called processPayroll that loops through every employee and prints their pay details,
    along with a method called totalPayrollCost that adds up the result of calculatePay across the entire list.

 */
