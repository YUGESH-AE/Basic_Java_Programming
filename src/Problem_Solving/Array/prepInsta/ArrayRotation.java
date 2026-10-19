package Problem_Solving.Array.prepInsta;

import java.util.Arrays;


/**
 * https://prepinsta.com/java-program/array-rotation/
 */
public class ArrayRotation {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        System.out.println("Original Array::" + Arrays.toString(a));
        leftRotate(a, 1);
        rightRotate(a, 1);

    }

    public static void rightRotate(int[] a, int n) {
        int temp;
        for (int i = 1; i <= n; i++) {
            temp = a[a.length - 1];
            for (int j = a.length - 1; j > 0; j--) {
                a[j] = a[j - 1];
            }
            a[0] = temp;
        }
        System.out.println("Right Rotation::" + Arrays.toString(a));
    }

    public static void leftRotate(int[] a, int n) {
        int temp;
        for (int i = 0; i < n; i++) {
            temp = a[0];
            for (int j = 0; j < a.length - 1; j++) {
                a[j] = a[j + 1];
            }
            a[a.length - 1] = temp;
        }
        System.out.println("Left Rotation::" + Arrays.toString(a));
    }
}
