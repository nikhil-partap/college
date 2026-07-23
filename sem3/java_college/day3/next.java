package java_college.day3;

public class next {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};
        int[] newArr = new int[arr.length];
        for(int i = (arr.length - 1), j = 0; i >= 0 ; i--, j++){
            newArr[j] = arr[i];
            System.out.println(newArr[j] + " " + arr[i] + " " + j + " " + i);
        }
    }
}
