package Java_Language_Features.Generics_Wildcards.MultiThreading.Thread_Methods;

public class DmoThreadMethods {
    public static void main(String[] args) throws InterruptedException {
        Thread c=new Thread(()-> System.out.println("Inside the thread main class"));
        System.out.println(c.isAlive());
        c.start();
        c.join();
        System.out.println(c.isAlive());
        Thread.sleep(3000);

    }
}
