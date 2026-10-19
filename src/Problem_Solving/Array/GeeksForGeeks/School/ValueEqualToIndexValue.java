package Problem_Solving.Array.GeeksForGeeks.School;

import java.util.ArrayList;


/**
 * Given an array Arr of N positive integers. Your task is to
 * find the elements whose value is equal to that of its index value ( Consider 1-based indexing ).
 * <p>
 * Note: There can be more than one element in the array which have the same value as its index.
 * You need to include every such element's index. Follows 1-based indexing of the array.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * N = 5
 * Arr[] = {15, 2, 45, 12, 7}
 * Output: 2
 * Explanation: Only Arr[2] = 2 exists here.
 * <p>
 * Example 2:
 * <p>
 * Input:
 * N = 1
 * Arr[] = {1}
 * Output: 1
 * Explanation: Here Arr[1] = 1 exists.
 * <p>
 * Your Task:
 * You don't need to read input or print anything.
 * Your task is to complete the function valueEqualToIndex() which takes the array of integers arr[]
 * and n as parameters and returns an array of indices where the given conditions are satisfied.
 * When there is no such element exists then return an empty array of length 0.
 * <p>
 * https://practice.geeksforgeeks.org/problems/value-equal-to-index-value1330/1?page=1&difficulty[]=-2&difficulty[]=-1&category[]=Arrays&sortBy=submissions
 */

public class ValueEqualToIndexValue {
    public static void main(String[] args) {

        int[] a = {15, 2, 45, 12, 7};
        ArrayList<Integer> list = valueEqualToIndex(a, a.length);
        list.forEach(i -> System.out.print(i + " "));
    }

    public static ArrayList<Integer> valueEqualToIndex(int[] a, int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (a[i] == i + 1) {
                list.add(a[i]);
            }
        }
        return list;
    }
}
