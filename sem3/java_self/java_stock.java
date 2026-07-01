import java.util.Scanner;

public class java_stock {
    public static void main(String[] args) {
        System.out.println("It works");

        Scanner input = new Scanner(System.in);

        System.out.println("enter a no to double it: ");

        int no = input.nextInt();
        no = no*2;
        System.out.println(no);
        input.close();
        
    }
}