package Multithreading.threadBasics;

public class MainThreadClass {
    public static void main(String[] args) {

        MyClass myClass=new MyClass();
        myClass.start();
    }
}

class MyClass extends Thread{
    @Override
    public void run() {
        System.out.println("Thread is Running");
    }
}
