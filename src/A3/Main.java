package A3;

public class Main {


}

/*
The first thing students should write is a Payable interface with two methods:
    -calculatePay, which returns a double
    - getPayDetails, which returns a String explaining how that pay was calculated.

Next, students should write an abstract Employee class.
This class should hold the state that every employee has in common,
    - specifically a name and
    - an id, along with a constructor that sets both fields.

    - concrete method called displayInfo that prints the employee's name and id.

Students should then write three subclasses: SalariedEmployee, HourlyEmployee, and ContractEmployee.

Each of these classes should extend Employee and implement Payable.
Each one needs to implement calculatePay and getPayDetails in a way that reflects how that type of employee is actually paid — for instance, a salaried employee's pay might be their annual salary divided by twelve,
an hourly employee's pay might be hours worked multiplied by an hourly rate, and
-a contract employee might simply be paid a flat fee.

After the employee classes are finished, students should write a PayrollSystem class that stores a list of Payable objects.
This class needs a method called processPayroll that loops through every employee and prints their pay details,
    along with a method called totalPayrollCost that adds up the result of calculatePay across the entire list.

Students should write a test class that builds a payroll system, adds a few employees of different types, and runs payroll.
At the top of that test class, as a comment,
students should answer the following question in three or four sentences:
why is Employee written as an abstract class while Payable is written as an interface, and
what would be lost if Payable had been written as an abstract class instead?

Every class and interface should be placed in its own file.
 */