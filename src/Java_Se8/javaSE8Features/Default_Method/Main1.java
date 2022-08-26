package Java_Se8.javaSE8Features.Default_Method;

interface MyInterface{
    void display();
   default void findFeature(){
       System.out.println(" new feature has been introduced");
   }
}

class A implements MyInterface{
    @Override
    public void display() {
        System.out.println("displayed in a");
    }
}
class B implements MyInterface{

    @Override
    public void display() {
        System.out.println("displayed in b");
    }

    @Override
    public void findFeature() {
        MyInterface.super.findFeature();
    }
}

public class Main1 {
    public static void main(String[] args) {
        MyInterface a=new B();
        a.display();
        a.findFeature();
    }
}
