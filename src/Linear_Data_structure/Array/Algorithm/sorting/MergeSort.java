package Linear_Data_structure.Array.Algorithm.sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] a = {78, 20, 99, 12, 90, 1, 23, 2, 79, 300, 21};
        System.out.println(Arrays.toString(a));
        sort(a, new int[a.length], 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }

    public static void sort(int[] a, int[] temp, int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2;
            sort(a, temp, low, mid);
            sort(a, temp, mid + 1, high);
            merge(a, temp, low, mid, high);
        }
    }

    private static void merge(int[] a, int[] temp, int low, int mid, int high) {
        for (int i = low; i <= high; i++) {
            temp[i] = a[i];
        }
        int i = low;
        int j = mid + 1;
        int k = low;
        while (i <= mid && j <= high) {
            if (temp[i] < temp[j]) {
                a[k] = temp[i];
                i++;
            } else {
                a[k] = temp[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            a[k] = temp[i];
            i++;
            k++;
        }
        while (j <= high) {
            a[k] = temp[j];
            j++;
            k++;
        }
    }
}
