package Multithreading.visibilityProblem;

public class Main {

    static volatile boolean running = true;

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> {
            while (running) {
                // Keep running
            }

            System.out.println("Thread stopped");
        });

        t1.start();

        Thread.sleep(1000);

        running = false;

        System.out.println("Main changed running to false");
    }

}
