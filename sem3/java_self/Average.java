// package java_self;
// Write a Java program that defines a method calculateAverage(int[] arr). This method should take an integer array as a 
// parameter and return the double average of all the elements in the array. In your main method, instantiate an array with 
// the values {10, 20, 30, 40, 50}, call the calculateAverage method, and print the result.

// import java.util.Scanner;

public class Average{
    static double calculateAverage(int[] arr){
        double avg = 0.0;
        // int sum = 0;
        int len = arr.length;
        for(int no : arr){
            avg += no;
        }
        avg /= len;
        
        return avg; 
    }
    public static void main(String[] args) {
        // int n= 0;
        // Scanner sc = new Scanner(System.in);
        int[] arr = new int[] {10, 20, 30, 40, 50};

        double ans = calculateAverage(arr);
        System.out.println(ans);
    }
}
