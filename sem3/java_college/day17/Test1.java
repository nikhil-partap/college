import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable {

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread name: " + Thread.currentThread().getName());
        }
    }
}

public class Test1 extends Thread {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 100; i++) {
            executor.execute(new Task());
        }
        executor.execute(() -> {
            System.out.println("Thread name: " + Thread.currentThread().getName());
        });
        executor.shutdown();
    }
}