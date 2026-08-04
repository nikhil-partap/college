// package assignment;

public class Cafeteria {
    int itemId;
    String itemName;
    double price;
    static String cafeteriaName= "UCampus Cafeteria";
    static double serviceCharge = 10.0;
    static int totalFoodItems = 0;

    Cafeteria(int id, String name, double price){
        this.itemId = id;
        this.itemName = name;
        this.price = price;
        totalFoodItems ++;
    }

    public double calculateFinalPrice() {
        return price + (price * serviceCharge / 100);
    }

    void displayItemDetails(){
        System.out.println("Item Id: " + this.itemId + "\nname: "+ this.itemName + 
        "\noriginal price: "+ this.price + "\nand Final Price: "+ 
        calculateFinalPrice());
    }

    static void changeServiceCharge(double newCharge){
        serviceCharge = newCharge;
    }
    static void displayCafeteriaDetails(){
        //  Cafeteria Name, Current Service Charge, and Total Food Items
        System.out.println("Cafeteria Name: " + cafeteriaName + 
        "\n \nCurrent Service Charges: " + serviceCharge + "\nTotal Food Items: "+ 
        totalFoodItems);
    }

    public static void main(String[] args) {
        Cafeteria item1 = new Cafeteria(101, "Veg Sandwich", 80); 
        Cafeteria item2 = new Cafeteria(102, "Cold Coffee", 120); 
        Cafeteria item3 = new Cafeteria(103, "Paneer Wrap", 150); 
        
        Cafeteria.displayCafeteriaDetails(); 
        
        item1.displayItemDetails(); 
        item2.displayItemDetails(); 
        item3.displayItemDetails(); 
        
        Cafeteria.changeServiceCharge(15); 
        // System.out.println("\nAfter Updating Service Charge"); ls

        
        item1.displayItemDetails(); 
        item2.displayItemDetails(); 
        item3.displayItemDetails();
    }



    // calculate...(s1.Price, s1.serviceCharge)
    // s1.display()

}