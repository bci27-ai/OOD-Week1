package A3;

public abstract class Employee {

    private String name;
    private int id;

    // public and private don't work here, check ehy later and adjust
    // not work because abs goes before class
    // learning to spell 101

// constructor
    public Employee(String name ,int id){
        this.name = name;
        this.id = id;
    }


    public void displayInfo(){
        System.out.print("The employees name is: " + this.name + "name" + "the id is: "+ this.id);
    }

}

/*
ext, students should write an abstract Employee class.
This class should hold the state that every employee has in common,
    - specifically a name and
    - an id, along with a constructor that sets both fields.

    - concrete method called displayInfo that prints the employee's name and id.

 */