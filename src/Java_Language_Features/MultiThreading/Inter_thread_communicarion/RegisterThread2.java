package Java_Language_Features.MultiThreading.Inter_thread_communicarion;



public class RegisterThread2 extends Thread{
   Course c;

    public RegisterThread2(Course c) {
        this.c=c;

    }

    @Override
    public void run() {
        c.registerForCourse(1);
    }
}

class CancelRegistration extends Thread {
    Course c;

    CancelRegistration(Course c) {
        this.c = c;
    }
    public void run() {
        c.cancelSeats();
    }
}