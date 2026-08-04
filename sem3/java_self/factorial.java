// Write a Java program that uses the Scanner class to take a positive integer input from the user. Using a while loop, 
// calculate and print the factorial of that number. Ensure you include a basic check (using an if statement) to print 
// an error message if the user enters a negative number.

import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int userNo = sc.nextInt();
        int ans = 1;
        if(userNo < 0){
            System.out.println("Please enter a +ve no");
        }else{
            while(userNo != 0){
                ans *= userNo ;
                userNo --;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}
