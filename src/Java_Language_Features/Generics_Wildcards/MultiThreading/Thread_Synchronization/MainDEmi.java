package Java_Language_Features.Generics_Wildcards.MultiThreading.Thread_Synchronization;

public class MainDEmi {
    public static void main(String[] args) {
        Course cse = new Course("CSE", 1);
        RegisterThread regObj1 = new RegisterThread(cse);
        regObj1.start();
        RegisterThread regObj2 = new RegisterThread(cse);
        regObj2.start();
    }
}
