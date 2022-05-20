package Java_Language_Features.Generics_Wildcards.GenericMEthods;

public class TestGeneric {
    public static void main(String[] args) {
        Integer[]v={1,2,3,4,5,6,7,8};
        String[] c={"yugesh","naryesh","sathesh"};
        listval(v);
        listval(c);
    }
    public static <E> void listval(E[]a){
        for (E i:a){
            System.out.println(i);
        }
    }
}
