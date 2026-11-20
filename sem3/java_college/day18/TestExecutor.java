package day18;

import java.util.concurrent.locks.ReentrantLock;

class Account1 {
    ReentrantLock r;
    int balance;

    Account1(int balance, ReentrantLock r) {
        this.balance = balance;
        this.r = r;
    }

    void setBalance() {
        r.lock();
        try {
            balance = balance + 1000;
            System.out.println("Balance is: " + balance + " Thread name: " + Thread.currentThread().getName());
        } finally {
            r.unlock();
        }  
        
    }
}

public class TestExecutor {
    public static void main(String[] args) {
        ReentrantLock lock1 = new ReentrantLock();
        Account1 a1 = new Account1(1000, lock1);
        Account1 a2 = new Account1(2000, lock1);

        Thread t1 = new Thread(() -> {
            a1.setBalance();
        });
        Thread t2 = new Thread(() -> {
            a1.setBalance();
        });
        Thread t3 = new Thread(() -> {
            a1.setBalance();
        });
        Thread t4 = new Thread(() -> {
            a2.setBalance();
        });
        Thread t5 = new Thread(() -> {
            a2.setBalance();
        });
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }

}

// what is reentrantLock in java is - a reentrant lock is a type of lock that
// allows a thread to
// acquire the same lock multiple times without blocking itself

//
// LinkedBlockingQueue is a thread-safe queue based on linked nodes. It
// implements the BlockingQueue interface and provides methods for adding,
// removing, and inspecting elements in a thread-safe manner. It is part of the
// java.util.concurrent package and is commonly used in concurrent programming
// to facilitate communication between threads.
