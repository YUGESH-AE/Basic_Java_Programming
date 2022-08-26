package Java_Se8.Java_Fundamentals.Lang;

public class NumberClass {
    public static void main(String[] args) {

        /*
        xxxValueof()
        Converts the value of this Number object to the xxx data type and returns it.
         */
        Integer b = 100;
        System.out.println(b.doubleValue());
        System.out.println(b.floatValue());
        System.out.println(b.shortValue());
        System.out.println(b.longValue());

        /*
        valueOf()
        Returns an Integer object holding the value of the specified primitive.
         */
        Integer x1 = Integer.valueOf(9);
        Double c1 = Double.valueOf(5);
        Float a1 = Float.valueOf("80");
        Integer b1 = Integer.valueOf("444", 16);

        System.out.println(x1);
        System.out.println(c1);
        System.out.println(a1);
        System.out.println(b1);

        /*
        toString && sting.valueOf()
        convert any number to string
         */
        Integer x2 = 100;
        String v2 = x2.toString();
        String z2 = String.valueOf(x2);
        System.out.println(v2);
        System.out.println(z2);

         /*
        xxx.Parsexxx()
        parse the value to the givem type
         */
        String a3 = "101";

        System.out.println(Double.parseDouble(a3));
        System.out.println(Float.parseFloat(a3));
        System.out.println(Integer.parseInt(a3));
        System.out.println();
    }
}
