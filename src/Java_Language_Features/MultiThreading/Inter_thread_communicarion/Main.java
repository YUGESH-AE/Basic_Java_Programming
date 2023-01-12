package Java_Language_Features.MultiThreading.Inter_thread_communicarion;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Course cse = new Course("CSE", 1);
        RegisterThread2 regObj1 = new RegisterThread2(cse);
        regObj1.start();
        RegisterThread2 regObj2 = new RegisterThread2(cse);
        regObj2.start();

        Thread.sleep(2000);
        // Running a cancellation thread after 2 seconds
        CancelRegistration cancelObj1 = new CancelRegistration(cse);
        cancelObj1.start();
    }
}
