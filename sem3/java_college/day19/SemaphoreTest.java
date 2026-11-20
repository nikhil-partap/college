package day19;

// what is semaphore in java is - a semaphore is a synchronization 
// mechanism that controls access to a shared resource by multiple threads. 
// It maintains a set of permits, and threads can acquire or release 
// permits to access the resource. Semaphores can be used to limit the 
// number of threads that can access a resource concurrently, ensuring 
// thread safety and preventing race conditions.

// question 
// create a fn getDownloadCopy() and in this fn i have to add semaphore to limit the number of threads that can download a copy of a file concurrently.
// getDownloadCopy() copy wala fn bana or usme printCopy run kar de 

import java.util.concurrent.Semaphore;

class Printer {
    Semaphore sem = new Semaphore(3); // create a semaphore with 3 permits
    // this means that only 3 threads can access the resource concurrently

    void getPrintCopy() {
        try {

            // sem.acquire(); // acquire a permit from the semaphore
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(1000);
            System.out.println("printing the copy");

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println("print is taken");
            // sem.release(); // release the permit back to the semaphore
        }
    }

    void getDownloadCopy() {
        boolean acquired = false;
        try {
            sem.acquire();
            acquired = true;
            getPrintCopy();
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(1000);
            System.out.println("printing the copy");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println("print is taken");
            if (acquired) {
                // this is to ensure that the permit is released only if it was successfully
                // acquired

                sem.release();
            }
        }
    }
}

public class SemaphoreTest {
    public static void main(String[] args) {
        Printer p = new Printer();

        Thread t1 = new Thread(() -> {
            p.getDownloadCopy();
        });

        Thread t2 = new Thread(() -> {
            p.getDownloadCopy();
        });

        Thread t3 = new Thread(() -> {
            p.getDownloadCopy();
        });

        Thread t4 = new Thread(() -> {
            p.getDownloadCopy();
        });

        Thread t5 = new Thread(() -> {
            p.getDownloadCopy();
        });

        Thread t6 = new Thread(() -> {
            p.getDownloadCopy();
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
    }
}