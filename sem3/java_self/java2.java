import java.util.Scanner;

public class java2 {
    public static void main(String[] args){
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

            if(item == 0 || balance < 5){
                // run = false;
                System.out.println("you exited the store thanks for you visit");
                break ;
            }
            switch(item){
                // case 0 -> System.out.println("you bought nothing thanks for you visit");
                case 1 ->{
                    if (balance >= 5){
                        balance -= 5;
                        System.out.println("you bought apple - $5 is subtracted from you wallet new balance is " + balance);
                    }else {
                        System.out.println("Insufficient balance");
                    }
                }
                case 2 -> {
                    if(balance >= 10){
                        balance -= 10;
                        System.out.println("you bought fruit - $10 is subtracted from you wallet new balance is " + balance);
                    }else {
                        System.out.println("Insufficient balance");
                    }
                }
                case 3 -> {
                    // balance -= ;
                    System.out.println("you bought shit - $0 is subtracted from you wallet new balance is " + balance);
                }
                case 4 -> {
                    if(balance >= 15){
                        balance -= 15;
                        System.out.println("you bought etc - $15 is subtracted from you wallet new balance is " + balance);
                    }else {
                        System.out.println("Insufficient balance");
                    }
                }
                default -> System.out.println("please purchase something else exit by entering 0");
                

            }
        } 

    }
}