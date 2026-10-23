package day16;

public class Main {

    public static void main(String[] args) {
        int[] numbers = { 2, 5, 8, 12, 16, 23, 38, 56, 72, 91 };
        int target = 23;

        int index = binarySearch(numbers, target);

        if (index == -1) {
            System.out.println("Value not found");
        } else {
            System.out.println("Value found at index: " + index);
        }
    }

    public static int binarySearch(int[] numbers, int target) {
        int high = numbers.length -1;
        int low = 0;
        int mid = low + ((low + high) / 2);
        if (target == numbers[mid]) {
            // we are done 
        } else {
            
        }
        
        return -1;
    }
}