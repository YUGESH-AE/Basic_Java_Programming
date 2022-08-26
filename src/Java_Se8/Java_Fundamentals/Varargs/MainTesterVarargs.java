package Java_Se8.Java_Fundamentals.Varargs;

public class MainTesterVarargs {
    public static void main(String[] args) {
        display(10,20,30,40,50);
    }
    public static void display(int...a){
        for (int x:a){
            System.out.print(x+"\t");
        }
    }
}


