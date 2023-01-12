package Java_SE8Features.Lambda;

public class MethodRefernces {
    public static void main(String[] args) {

        //static method refernce
        Calculator calculator=Calc::addSomething;
        calculator.add(10,20);

        //non static method refrence
        Calc c=new Calc();
        Calculator calculator1=c::addSum;
        calculator1.add(10,20);

        //refernce to cpnstructor
        Message message=Mss::new;
        message.message("Hello how are u");
    }
}

class Calc{
    public static void addSomething(int num1,int num2){
        int c=num1+num2;
        System.out.println("The addition of "+num1+" and"+num2+" is:"+c);
    }
    public void addSum(int num1,int num2){
        int c=num1+num2;
        System.out.println("The addition of "+num1+" and"+num2+" is:"+c);
    }
}
interface Calculator{
    void add(int num1,int num2);
}


class Mss{
    public Mss(String s1){
        System.out.println("--> message"+s1);
    }
}

interface Message{
    void message(String s1);
}