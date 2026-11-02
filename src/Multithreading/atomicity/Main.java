package Multithreading.atomicity;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Counter counter=new Counter();

        Thread t1=new Thread(
                ()->{
                    for(int i=0;i<10000;i++){
                        counter.increment();
                    }
                }
        );

        Thread t2=new Thread(
                ()->{
                    for(int i=0;i<10000;i++){
                        counter.increment();
                    }
                }
        );
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(counter.count.get());

    }
}

class Counter{

    AtomicInteger count=new AtomicInteger(0);

    public synchronized void increment(){
        count.incrementAndGet();
    }
}