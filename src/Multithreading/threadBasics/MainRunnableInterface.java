package Multithreading.threadBasics;

public class MainRunnableInterface {
    public static void main(String[] args) {
       MyClassRunnable myClassRunnable=new MyClassRunnable();

       Thread thread=new Thread(myClassRunnable);
       thread.start();
    }

}

class MyClassRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread is Running");
    }
}
