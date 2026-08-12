import java.util.Random;
import java.util.Scanner;

@FunctionalInterface
interface OTPValidator {
    boolean validateOTP(int generatedOTP, int enteredOTP);
}

@FunctionalInterface
interface PaymentValidator {
    boolean validatePayment(double balance, double amount);
}

@FunctionalInterface
interface AgeValidator {
    boolean checkEligibility(int age);
}

class OTPValidatorImpl implements OTPValidator {

    @Override
    public boolean validateOTP(int generatedOTP, int enteredOTP) {

        return generatedOTP == enteredOTP;

        // return generatedOTP == 1234;
    }
}

class PaymentValidatorImpl implements PaymentValidator {

    @Override
    public boolean validatePayment(double balance, double amount) {

        // Payment should not exceed balance
        if (amount <= balance && amount > 0) {
            return true;
        }

        return false;

        // return true;
    }
}

class AgeValidatorImpl implements AgeValidator {

    @Override
    public boolean checkEligibility(int age) {

        if (age >= 18) {
            return true;
        }

        return false;

        // return age >= 21;
    }
}

public class Assign {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        // int testOTP = 1234;
        // System.out.println(testOTP);

        while (true) {

            System.out.println("\n========== Functional Interface Assignment ==========");
            System.out.println("1. OTP Verification System");
            System.out.println("2. Payment Verification System");
            System.out.println("3. Age Verification System");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            // System.out.println("Choice = " + choice);

            switch (choice) {

                case 1:

                    int generatedOTP = 1000 + random.nextInt(9000);

                    System.out.println("\nGenerated OTP : " + generatedOTP);
                    System.out.print("Enter OTP : ");

                    int enteredOTP = sc.nextInt();

                    // System.out.println("Generated = " + generatedOTP);
                    // System.out.println("Entered = " + enteredOTP);

                    OTPValidator otpValidator = new OTPValidatorImpl();

                    if (otpValidator.validateOTP(generatedOTP, enteredOTP)) {
                        System.out.println("OTP Verified Successfully.");
                    } else {
                        System.out.println("Invalid OTP.");
                    }

                    break;

                case 2:

                    System.out.print("\nEnter Account Balance : ");
                    double balance = sc.nextDouble();

                    System.out.print("Enter Payment Amount : ");
                    double amount = sc.nextDouble();

                    // balance = 5000;
                    // amount = 2500;

                    // System.out.println(balance);
                    // System.out.println(amount);

                    PaymentValidator paymentValidator = new PaymentValidatorImpl();

                    if (paymentValidator.validatePayment(balance, amount)) {
                        System.out.println("Payment Successful.");
                    } else {
                        System.out.println("Payment Failed.");
                    }

                    break;

                case 3:

                    System.out.print("\nEnter Your Age : ");
                    int age = sc.nextInt();

                    // age = 17;
                    // age = 18;
                    // age = 25;

                    // System.out.println("Age = " + age);

                    AgeValidator ageCheck = new AgeValidatorImpl();

                    if (ageCheck.checkEligibility(age)) {
                        System.out.println("You are Eligible for Registration.");
                    } else {
                        System.out.println("Sorry! You are Not Eligible.");
                    }

                    break;

                case 4:

                    System.out.println("Thank You!");
                    sc.close();
                    System.exit(0);

                default:

                    System.out.println("Invalid Choice.");

                    // break; 
            }
        }
    }
}