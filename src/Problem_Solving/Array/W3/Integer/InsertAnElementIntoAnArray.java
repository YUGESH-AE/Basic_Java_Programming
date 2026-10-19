package Problem_Solving.Array.W3.Integer;

import java.util.Arrays;


/**
 * Insert an element into an array
 */
public class InsertAnElementIntoAnArray {
    public static void main(String[] args) {
        insertElement(new int[]{12, 34, 53, 19, 56, 90}, 60, 4);
    }

    public static void insertElement(int[] a, int val, int pos) {
        System.out.println("Original Array::" + Arrays.toString(a));

        int[] temp = new int[a.length + 1];
        for (int i = 0; i < a.length + 1; i++) {
            if (i < pos - 1) {
                temp[i] = a[i];
            } else if (i == pos - 1) {
                temp[i] = val;
            } else {
                temp[i] = a[i - 1];
            }
        }
        System.out.println("After Insertion::" + Arrays.toString(temp));
    }
}
