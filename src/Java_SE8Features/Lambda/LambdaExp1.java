package Java_SE8Features.Lambda;

public class LambdaExp1 {

    public static void main(String[] args) {
        addition sum=(a,b)-> a+b;
        addition sumation=(a1,b1)->{
            return (a1+b1);
        };
        Greetings concat=(s1,s2)->s1.concat(s2);

        System.out.println(sumation.add(300,200));
        System.out.println(sum.add(10,20));
        System.out.println(concat.concst("specialist","programmer"));

    }
}


interface addition{
    int add(int a,int b);
}

interface Greetings{
    String concst(String s1,String s2);
}