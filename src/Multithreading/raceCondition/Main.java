package Multithreading.raceCondition;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Counter counter=new Counter();

        Runnable task=()->{
            for(int i=0;i<10000;i++){
                counter.increment();
            }
        };

        Thread t1=new Thread(task);
        Thread t2=new Thread(task);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(counter.count);
    }
}
class Counter{

    int count=0;

    /**
     *  without synchronized word race condition would occur
     *  with synchronized we can prevent race condition
     */
    public synchronized void increment(){
        count++;
    }
}
