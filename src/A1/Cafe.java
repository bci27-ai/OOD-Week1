package A1;

import java.util.ArrayList;

public class Cafe {

    private ArrayList <MenuItem> menu;

    public void addMenuItem(MenuItem item){
        menu.add(item);
    }

    public void placeOrder(MenuItem item){


    }
    // method using loop to print all menuItems

    public void displayMenu(){
       for(MenuItem m : menu){
           System.out.println(menu);
       }
    }
}

/*
The third class is Cafe. Like Order, Cafe should store its available menu items in a list rather than in individual fields.

Students should write
    a method called addMenuItem that adds an item to the menu,
    a method called placeOrder that accepts an Order and calculates its total,
    a method called displayMenu that prints every item currently on the menu.
 */