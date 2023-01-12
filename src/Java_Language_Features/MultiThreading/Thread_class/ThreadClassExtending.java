package Java_Language_Features.MultiThreading.Thread_class;

public class ThreadClassExtending {
    public static void main(String[] args) {
        demo s=new demo();
        s.start();
    }
}

class demo extends Thread{
    @Override
    public void run() {
        System.out.println("Running in thread class");
    }
}