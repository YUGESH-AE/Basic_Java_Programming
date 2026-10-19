package Problem_Solving.Array.W3.Integer;

import java.util.Arrays;


/**
 * Segregate all 0s on left side and all 1s on right side of a given array of 0s and 1s
 */
public class Separating_0_1 {
    public static void main(String[] args) {
        int nums[] = {0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1};
        separating(nums);
    }

    public static void separating(int[] a) {
        System.out.println("Before Separating::" + Arrays.toString(a));
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0 && a[j] != 0) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
            if (a[j] == 0) {
                j++;
            }
        }
        System.out.println("After Separating::" + Arrays.toString(a));
    }
}
