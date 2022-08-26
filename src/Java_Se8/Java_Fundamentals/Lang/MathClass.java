package Java_Se8.Java_Fundamentals.Lang;

public class MathClass {
    public static void main(String[] args) {

        /*
        abs()
        Returns the absolute value of the argument.
         */
        Integer a = -8;
        double d = -100;
        float f = -90;

        System.out.println(Math.abs(a));
        System.out.println(Math.abs(d));
        System.out.println(Math.abs(f));

        /*
        ceil()
        Returns the smallest integer that is greater than or
        equal to the argument. Returned as a double.
         */
        double d1 = 100.675;
        float f1 = 90.47f;

        System.out.println(Math.ceil(d1));
        System.out.println(Math.ceil(f1));

        /*
        floor()
        Returns the largest integer that is less than
        or equal to the argument. Returned as a double.
         */
        double d2 = 100.675;
        float f2 = 90.59f;
        System.out.println(Math.floor(d2));
        System.out.println(Math.floor(f2));

        /*
        min() and max() returns smallest and largest value
         */
        System.out.println(Math.min(12.123, 12.456));
        System.out.println(Math.min(23.12, 23.0));

        System.out.println(Math.max(12.123, 12.456));
        System.out.println(Math.max(23.12, 23.0));
    }
}
