package Problem_Solving.Array.W3.Integer;

import java.util.Arrays;

/**
 * Rearrange all the elements of an given array of integers
 * so that all the odd numbers come before all the even numbers.
 */
public class OddNumbersComeBeforeEven {
    public static void main(String[] args) {
        ComeBefore(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
    }

    public static void ComeBefore(int[] a) {
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0 && a[j] != 0) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
            if (a[j] % 2 == 0) {
                j++;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
