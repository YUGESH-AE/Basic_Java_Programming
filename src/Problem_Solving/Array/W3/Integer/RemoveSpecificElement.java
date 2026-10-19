package Problem_Solving.Array.W3.Integer;


import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Remove a specific element from an array
 */
public class RemoveSpecificElement {
    public static void main(String[] args) {
        removeSpecificElement(new int[]{25, 14, 56, 15, 36, 56, 77, 18, 29, 49}, 49);
    }

    public static void removeSpecificElement(int[] a, int value) {
        System.out.println("Original Array::" + Arrays.toString(a));

        int[] streamArray = IntStream.range(0, a.length)
                .filter(i -> a[i] != value)
                .map(i -> a[i])
                .toArray();
        System.out.println("AfterRemoving::" + Arrays.toString(streamArray));
    }
}
