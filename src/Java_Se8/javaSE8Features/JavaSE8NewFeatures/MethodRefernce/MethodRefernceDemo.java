package Java_Se8.javaSE8Features.JavaSE8NewFeatures.MethodRefernce;

import java.util.function.BiFunction;
import java.util.function.Function;

public class MethodRefernceDemo {

    public static int add(int a,int b){
        return a+b;
    }
    public void printing(String  msg){
        msg=msg.toUpperCase();
        System.out.println(msg);
    }
    public static void main(String[] args) {


        Function<Integer,Double>fun=(n)->Math.sqrt(n);
        System.out.println(fun.apply(20));

        //static method refernce

        Function<Integer,Double>function=Math::sqrt;
        System.out.println(function.apply(20));

        BiFunction<Integer,Integer,Integer>biFunction=(a,b)->MethodRefernceDemo.add(a,b);
        System.out.println(biFunction.apply(20,30));

        BiFunction<Integer,Integer,Integer>bii=MethodRefernceDemo::add;
        System.out.println(bii.apply(40,50));

        //instance method reference
        MethodRefernceDemo methodRefernceDemo=new MethodRefernceDemo();
        Printable printable=methodRefernceDemo::printing;
        printable.print("specialist programmer");

        //reference to arbitary object
        Function<String,String>ss=String::toUpperCase;
        System.out.println(ss.apply("hello world"));
    }
}
@FunctionalInterface
interface Printable{
    void print(String msg);
}