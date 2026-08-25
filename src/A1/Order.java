package A1;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Order {

    ArrayList<Order> MenuItem = MenuItem();


    public void addItem(){
        // add ONE item to a menu

    }

    public void calculateTotal(){
        // applies a change to the total based on total of array List

    }

    public void displayOrderDetails(){
         System.out.println("Print out the list here, along with the total amount." + calculateTotal());

    }



}


/*
Order class. Rather than storing items in three separate fields,
    the Order class holds a list of MenuItem objects.
write a method called addItem that adds a single MenuItem to that list,
a method called calculateTotal that adds up the price of every item in the list
a method called displayOrderDetails that prints each item in the order along with the total amount due.
 */