package Java_Se8.Java_Language_Features.MultiThreading.Runnable_interface;

public class ImplementingRunnable {
    public static void main(String[] args) {
        demo2 a=new demo2();
        Thread b=new Thread(a);
        b.start();
        Thread c=new Thread(()-> System.out.println("Running in lambda thread class"));
        c.start();
    }
}

class demo2 implements Runnable{

    @Override
    public void run() {
        System.out.println("Running");
    }
}