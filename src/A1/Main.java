package A1;
/// main class for the Cafe. Creates objects, and menu.

public class Main{

    // main class
    public static void main(String[] args){

        Cafe caf = new Cafe();

        // name price category

        // learned this, its really cool
        caf.addMenuItem(new MenuItem("Skirt Steak",8.99,"Food"));
        caf.addMenuItem(new MenuItem("RibEye",9.99,"Food"));
        caf.addMenuItem(new MenuItem("Water", 0.10, "Beverage"));
        caf.addMenuItem(new MenuItem("Juice", 3.20, "Beverage"));

        caf.displayMenu();

        //caf.placeOrder(1);

        Order o = new Order();
        //o.addItem("Just the first name, or index etc");

        o.displayOrderDetails();

    }



}

