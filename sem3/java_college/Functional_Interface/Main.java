import java.util.Random;
import java.util.Scanner;

@FunctionalInterface
interface OTPValidator {
    boolean verifyOTP(int inputOTP, int generatedOTP);
}

class OTPValidatorImpl implements OTPValidator {
    @Override
    public boolean verifyOTP(int inputOTP, int generatedOTP) {
        return generatedOTP == inputOTP;
    }
}





public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Random random = new Random();

        int generatedOTP = 1000 + random.nextInt(9000);

        System.out.println("Generated OTP: " + generatedOTP);

        System.out.print("Enter OTP: ");
        int enteredOTP = sc.nextInt();

        OTPValidator validator = new OTPValidatorImpl();

        if (validator.verifyOTP(generatedOTP, enteredOTP)) {
            System.out.println("OTP Verified Successfully.");
        } else {
            System.out.println("Invalid OTP.");
        }

        sc.close();
    }
}