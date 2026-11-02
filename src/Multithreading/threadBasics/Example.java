package Multithreading.threadBasics;

public class Example {
    public static void main(String[] args) {

        Runnable task=()->{

            for (int i = 1; i <= 5; i++) {

                System.out.println(
                        Thread.currentThread().getName()
                                + " : " + i
                );
            }
        };
        Thread t1=new Thread(task,"Thread-1");
        Thread t2=new Thread(task,"Thread-2");
        t1.start();
        t2.start();
    }


}
