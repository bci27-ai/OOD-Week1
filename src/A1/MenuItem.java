package A1;
/// stores possible items on the menu,
///contains a constructor with name, price, category
/// contains method for displaying a manu tidemt object in readable format.
public class MenuItem {

    private String name;
    private double price;
    private String category;

    public MenuItem(String name, double price, String category){
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public void displayItemInfo(){
        // using a loop in the
        // never mind
        System.out.println("Name: " + this.name + " Price: $" + this.price + " Category: " + this.category );
    }

    // getters
    public String getName() {
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public double getPrice(){
        return this.price;
    }
    public void setPrice(double price){
        this.price = price;
    }

    public String getCategory(){
        return this.category;
    }
    public void setCategory(String category){
        this.category = category;
    }
}
/*

The system should allow the café to maintain a menu of items, accept a single order, and calculate the total bill for that order.

The first class students need to write is MenuItem.
Each MenuItem should store
    a name,
    a price, and
    a category, such as "Beverage" or "Food."
Students should write a constructor that initializes all three fields,
along with getter and setter methods for each one.
They should also write a method called displayItemInfo that prints the item's details in a readable format.

*/


