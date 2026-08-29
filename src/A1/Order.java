package A1;
/// one arrayList that zstores MenuItem binding- menuItems
/// methods: Calculate total and display order details

import java.util.ArrayList;

public class Order {

    private ArrayList<MenuItem> menuItems;

    public void addItem(MenuItem item){
        // add ONE item to a menu
        menuItems.add(item);

    }

    public void calculateTotal(){
        double total = 0;
        // applies a change to the total based on total of array List
        for(MenuItem m : menuItems){
            total += m.getPrice();
        }
    }

    public void displayOrderDetails(){

        for( MenuItem m : menuItems){
            System.out.println(menuItems);
        }
        calculateTotal();
         //System.out.println("Print out the list here, along with the total amount." + calculateTotal());
    }

}
/*
Order class. Rather than storing items in three separate fields,
    the Order class holds a list of MenuItem objects.
write a method called addItem that adds a single MenuItem to that list,
a method called calculateTotal that adds up the price of every item in the list
a method called displayOrderDetails that prints each item in the order along with the total amount due.
 */
