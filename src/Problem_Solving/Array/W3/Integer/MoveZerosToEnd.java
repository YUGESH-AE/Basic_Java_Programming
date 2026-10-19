package Problem_Solving.Array.W3.Integer;

import java.util.Arrays;


/**
 * Move all 0's to the end of an array
 */
public class MoveZerosToEnd {
    public static void main(String[] args) {
        moveZerosToEnd(new int[]{0, 0, 1, 0, 3, 0, 5, 0, 6});
    }

    public static void moveZerosToEnd(int[] a) {
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0 && a[j] == 0) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
            if (a[j] != 0) {
                j++;
            }
        }
        System.out.println("Zeros at end::" + Arrays.toString(a));
    }
}
