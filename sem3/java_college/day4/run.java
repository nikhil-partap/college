package java_college.day4;

public class run {
    public static void main(String[] args){

        // create a 3d array with the inetilization method 
        int [][][] arr = {
            {
                {1, 2, 3},
                {4, 5, 6}
            },
            {
                {7, 8, 9},
                {10, 11, 12}
            }
        };
        int total = 0;
        for (int[][] layer : arr) {
            for (int[] row : layer) {
                for (int no : row) {
                    total += no;
                    System.out.print(no + " ");
                }
                System.out.println();
            }
        }
        System.out.println("Total: " + total);  
    }
}
