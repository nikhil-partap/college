import java.util.Scanner;
import java.util.Hashtable;

public class java3 {

    record Menu(String name , int price){}

    public static void main(String[] args){
        

        Hashtable<Integer, Menu> menu = new Hashtable<>();
        menu.put(1, new Menu("apple" ,5));
        menu.put(2, new Menu("fruit" ,10));
        menu.put(3, new Menu("shit" ,0));
        menu.put(4, new Menu("etc" ,15));

        int balance = 20;
        boolean run = true;
        System.out.println("your current balance is " + balance);

        System.out.println("""
        the menu is
        1. apple - $5
        2. fruit - $10
        3. shit - $free
        4. etc - $15 """);
        
        Scanner input = new Scanner(System.in);

        
        while (run) {
            
            System.out.println("enter the no of the item that you want to buy and enter 0 is you want to exit \n");

            int item = input.nextInt();
            Menu UserChoice = menu.get(item);

            if(item == 0 || balance < 5){
                // run = false;
                System.out.println("you exited the store thanks for you visit");
                break ;
            }

            balance = purchase(item, balance, UserChoice.name(), UserChoice.price());

        } 

    }

    public static int purchase(int itemNo, int balance, String itemName, int price){
        
        if(balance >= price){
            balance -= price;
            System.out.println("You bought " + itemName + " - $" + price + " is subtracted from your wallet. New balance is: $" + balance);                    }else {
                        System.out.println("Insufficient balance");
        
                    }
                
        return balance;
    }
    
    
}


