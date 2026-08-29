package A1;
/// test class for the caf
/// main method contains:
/// creastee two solids, and two liquids
///
public class TestCaf {

    public static void main(String[] args){
        // test caf make objects, add prices etc.
        Cafe caf = new Cafe();

        // name price category

        // learned this, its really cool
        caf.addMenuItem(new MenuItem("Chicken",24.99,"Food"));
        caf.addMenuItem(new MenuItem("Turkey",29.99,"Food"));
        caf.addMenuItem(new MenuItem("Water", 11.10, "Beverage"));
        caf.addMenuItem(new MenuItem("Tea", 13.20, "Beverage"));

        caf.displayMenu();

        //caf.placeOrder(1);

        Order o = new Order();
        //o.addItem("Just the first name, or index etc");

        o.displayOrderDetails();


    }

//write a test class that creates a café, builds a menu, places an order, and prints the resulting bill.

/*
    test to break

    methods:
    add item and price,
    print total

 */

}
