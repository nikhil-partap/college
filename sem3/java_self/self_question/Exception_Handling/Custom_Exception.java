import java.util.Scanner;

class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

public class Custom_Exception  {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        try{
            if(age >= 18){
                System.out.println("Eligible");
            }else{
                throw new InvalidAgeException("Invalid integer");
            }
        }catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
    
}