package Linear_Data_structure.Array.Implementation;

import java.util.Arrays;

public class DutchNationalFlags {
    public static void main(String[] args) {
        int[] a = {2, 2, 1, 1, 0, 2, 1, 0, 0, 2, 1, 0, 2, 1, 0};
        System.out.println("Before::" + Arrays.toString(a));
        moveZerosOnesTwos(a);
        System.out.println("After::" + Arrays.toString(a));
    }

    public static void moveZerosOnesTwos(int[] a) {
        int i = 0, j = 0, k = a.length - 1;
        while (i <= k) {
            if (a[i] == 0) {
                swap(a, i, j);
                i++;
                j++;
            } else if (a[i] == 1) {
                i++;
            } else if (a[i] == 2) {
                swap(a, i, k);
                k--;
            }
        }
    }

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
