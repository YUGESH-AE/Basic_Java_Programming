package Problem_Solving.Array.W3.Integer;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;


/**
 * Remove the duplicate elements of a given array and return the new length of the array
 */
public class RemoveDuplicateAndReturnNewLengthOfArray {
    public static void main(String[] args) {
        int nums[] = {20, 20, 30, 40, 50, 50, 50};
        removeDupLength(nums);
    }

    public static void removeDupLength(int[] a) {
        System.out.println("Original array    ::" + Arrays.toString(a));
        System.out.println("Length of Original::" + a.length);

        Set<Integer> set = new LinkedHashSet<>();
        for (int i : a) {
            set.add(i);
        }
        Object[] b = set.toArray();
        System.out.println("After removing duplicates       ::" + Arrays.toString(b));
        System.out.println("Length after removing duplicates::" + b.length);
    }
}
