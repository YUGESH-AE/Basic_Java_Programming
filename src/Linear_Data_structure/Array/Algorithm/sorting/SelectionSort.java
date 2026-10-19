package Linear_Data_structure.Array.Algorithm.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] a = {48, 23, 12, 45, 1, 56, 90};
        System.out.println(Arrays.toString(a));
        selection(a);
        System.out.println(Arrays.toString(a));

    }

    public static void selection(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }
    }
}
