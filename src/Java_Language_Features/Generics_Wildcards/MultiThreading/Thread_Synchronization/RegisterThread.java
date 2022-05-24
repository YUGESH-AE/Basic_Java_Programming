package Java_Language_Features.Generics_Wildcards.MultiThreading.Thread_Synchronization;

public class RegisterThread  extends Thread{
    Course c;

    public RegisterThread(Course c) {
            this.c=c;

    }

    @Override
    public void run() {
        c.registerForCourse(1);
    }
}
