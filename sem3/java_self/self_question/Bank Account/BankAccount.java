// package self_question.Bank Account;

public class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;

    BankAccount(String holder, int accountNumber, double balance){
        this.accountHolder = holder;
        this.accountNumber = accountNumber;
        this.balance = balance;

    }
    void deposit(double amount){
        this.balance += amount;
    }

    boolean withdraw(double amount){
        if(amount <= balance){
            this.balance -= amount;
            return true;
        }
        else {
            System.out.println("Insufficient Balance");
            return false;
        }
    }
// Account Holder : Nikhil
// Balance : 5500.0

    void displayBalance(){
        System.out.println("Account Holder : "+ accountHolder);
        System.out.println("Balance : "+ balance);
    }
}
