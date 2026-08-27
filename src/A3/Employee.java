package A3;

public abstract class Employee {

    private String name;
    private int id;

    //FIXME
    // public and private don't work here, check ehy later and adjust
    // learning to spell 101


    public Employee(String name ,int id){
        this.name = name;
        this.id = id;
    }


    public void displayInfo(){
        System.out.print("The employees name is: " + "name" + "the id is: "+ "id");
    }

}

/*
ext, students should write an abstract Employee class.
This class should hold the state that every employee has in common,
    - specifically a name and
    - an id, along with a constructor that sets both fields.

    - concrete method called displayInfo that prints the employee's name and id.

 */