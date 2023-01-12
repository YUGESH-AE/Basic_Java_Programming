package Java_SE8Features.StaticMethod;

interface Myinterface{
    static void display(){
        System.out.println("Displaying in interface");
    }
}
class A implements Myinterface{
    public void show(){
        System.out.println("showing");
    }
}

public class Main {
    public static void main(String[] args) {
        Myinterface.display();
    }
}
