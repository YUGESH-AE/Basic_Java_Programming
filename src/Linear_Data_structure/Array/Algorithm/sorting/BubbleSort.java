package Linear_Data_structure.Array.Algorithm.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {26, 48, 90, 34, 12, 4, 13, 45};
        System.out.println(Arrays.toString(a));
        bubbleSort(a);
        display(a);

    }

    public static void display(int[] a) {
        System.out.println(Arrays.toString(a));
    }

    public static void bubbleSort(int[] a) {
        boolean isSwapped;
        for (int i = 0; i < a.length - 1; i++) {
            isSwapped = false;
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
                isSwapped = true;
            }
            if (isSwapped == false) break;
        }
    }
}
