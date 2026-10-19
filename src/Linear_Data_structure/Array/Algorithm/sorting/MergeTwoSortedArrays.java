package Linear_Data_structure.Array.Algorithm.sorting;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] a = {1, 5, 8, 10};
        int[] b = {6, 9, 15, 20};
        int[] result = merge(a, b, 4, 4);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(result));
    }

    public static int[] merge(int[] a, int[] b, int n, int m) {
        int[] result = new int[m + n];
        int i = 0, j = 0, k = 0;
        while (i < n && j < m) {
            if (a[i] < b[j]) {
                result[k] = a[i];
                i++;
            } else {
                result[k] = b[j];
                j++;
            }
            k++;
        }
        while (i < n) {
            result[k] = a[i];
            i++;
            k++;
        }
        while (j < m) {
            result[k] = b[j];
            j++;
            k++;
        }
        return result;
    }
}
