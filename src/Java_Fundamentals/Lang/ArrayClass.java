package Java_Fundamentals.Lang;

import static java.util.Arrays.*;

public class ArrayClass {
    public static void main(String[] args) {
        int[] a = {1, 50, 38, 48, 20, 19, 23, 100, 4, 7, 9, 3, 11};
        System.out.println(binarySearch(a, 100));
        sort(a);
        for (int i : a) {
            System.out.print(i + " ");
        }

    }
}
