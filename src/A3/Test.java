package A3;
/*

Employee has more structure in common with the employee types.
The Payable interface would not be possible to implement if it was a class because only one class can extend another at a time.
Payable has abstract methods that could be used in other ways then just for employees

 */

public class Test {

    public static void main(String[] args){
        PayrollSystem paySys = new PayrollSystem();

        Employee Ce1 =(new ContractEmployee("Bob", 001));
        Employee Ce2 =( new ContractEmployee("Jerry", 002));

        Ce1.displayInfo();
        Ce2.displayInfo();

        Employee He1 = new HourlyEmployee("Greg", 003);
        Employee He2 = new HourlyEmployee("James", 004);

        He1.displayInfo();
        He2.displayInfo();

        Employee Se1 = new SalariedEmployee("Warthog", 005);
        Employee Se2 = new SalariedEmployee("Assimilator", 006);

        Se1.displayInfo();
        Se2.displayInfo();
    }

}

/*
write a test class that
    builds a payroll system,
    adds a few employees of different types, and
    runs payroll.

At the top of that test class, as a comment,
students should answer the following question in three or four sentences:
why is Employee written as an abstract class while Payable is written as an interface, and
what would be lost if Payable had been written as an abstract class instead?
 */
