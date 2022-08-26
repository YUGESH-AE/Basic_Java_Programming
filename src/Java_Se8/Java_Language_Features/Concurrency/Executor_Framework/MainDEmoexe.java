package Java_Se8.Java_Language_Features.Concurrency.Executor_Framework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainDEmoexe {
    public static void main(String[] args) {
        upload a=new upload();
        ExecutorService exservice= Executors.newSingleThreadExecutor();
        exservice.execute(a);

    }
}
class upload extends Thread{
    @Override
    public void run() {
        System.out.println("Executing");
    }
}