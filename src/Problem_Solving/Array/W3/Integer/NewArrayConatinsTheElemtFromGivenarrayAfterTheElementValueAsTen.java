package Problem_Solving.Array.W3.Integer;

import java.util.Arrays;


/**
 * Create a new array from a given array of integers,
 * new array will contain the elements from
 * the given array after the last element value 10
 */
public class NewArrayConatinsTheElemtFromGivenarrayAfterTheElementValueAsTen {
    public static void main(String[] args) {
        newArrayAfterTen(new int[]{11, 10, 13, 10, 45, 20, 33, 53});
    }

    public static void newArrayAfterTen(int[] a) {
        System.out.println("Original Array::" + Arrays.toString(a));
        int l = a.length - 1;
        while (a[l] != 10) {
            l--;
        }
        int[] temp = new int[a.length - 1 - l];
        int j = 0;
        for (int i = l + 1; i < a.length; i++) {
            temp[j] = a[i];
            j++;
        }
        System.out.println("After Element 10::" + Arrays.toString(temp));
    }
}
