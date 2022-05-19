package javaSE8Features.LambdaExpression.FunctionalInterface;

@FunctionalInterface
interface StringFormatter{
    String format(String string1,String string2);
}

public class UserDefinedLamda_FunctionalInterface {
    public static void main(String[] args) {
        String a="Lambda";
        String b="Expression";
        StringFormatter format1=((string1, string2) -> string1+string2);
        System.out.println(format1.format(a,b)+"\n");
        StringFormatter format2=((string1, string2) -> string1.toUpperCase()+""+string2.toUpperCase());
        System.out.println(format2.format(a,b)+"\n");
        StringFormatter format3=((string1, string2) -> string1+"-"+string2);
        System.out.println(format3.format(a,b));
    }
}
