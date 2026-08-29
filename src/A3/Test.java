package A3;
/*

Employee has more structure in common with the employee types.
The Payable interface would not be possible to implement if it was a class because only one class can extend another at a time.
Payable has abstract methods that could be used in other ways then just for employees

 */

public class Test {

    PayrollSystem paySys = new PayrollSystem();

    /*Ce1.Employee(new ContractEmployee("Bob", 001));
    Ce2.Employee( new ContractEmployee("Jerry", 002));

    Ce1.displayInfo();
    Ce2.displayInfo();

    He1.Employee = new HourlyEmployee();

*/
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
