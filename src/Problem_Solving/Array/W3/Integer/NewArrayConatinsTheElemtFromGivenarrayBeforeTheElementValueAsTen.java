package Problem_Solving.Array.W3.Integer;

import java.util.Arrays;


/**
 * Create a new array from a given array of integers,
 * new array will contain the elements from
 * the given array before the last element value 10
 */
public class NewArrayConatinsTheElemtFromGivenarrayBeforeTheElementValueAsTen {
    public static void main(String[] args) {
        newBeforeAfterTen(new int[]{11, 15, 13, 10, 45, 20, 33, 53});
    }

    public static void newBeforeAfterTen(int[] a) {
        System.out.println("Original Array::" + Arrays.toString(a));
        int l = 0;
        while (a[l] != 10) {
            l++;
        }
        int[] temp = new int[l];
        int j = 0;
        for (int i = 0; i < l; i++) {
            temp[j] = a[i];
            j++;
        }
        System.out.println("Before Element 10::" + Arrays.toString(temp));
    }
}
