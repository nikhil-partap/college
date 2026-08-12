package Polymorphism;

public class StringTest {
    public static void main(String[] args) {
        String strInput = "this is a wonderful day";
        // output = "Day Wonderful A Is This" // what we want to achieve
        String[] strArray = strInput.split(" ");
        // Reverse the array and capitalize each word
        for (int i = strArray.length - 1; i >= 0; i--) {
            System.out.print(strArray[i].substring(0, 1).toUpperCase() + strArray[i].substring(1).toLowerCase() + " ");
        }
    }
}
