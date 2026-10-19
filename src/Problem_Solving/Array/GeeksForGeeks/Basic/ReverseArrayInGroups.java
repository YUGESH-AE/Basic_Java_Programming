package Problem_Solving.Array.GeeksForGeeks.Basic;

import java.util.ArrayList;
import java.util.Arrays;


/**
 * Given an array arr[] of positive integers of size N.
 * Reverse every sub-array group of size K.
 * <p>
 * Note: If at any instance, there are no more subarrays of size greater than or equal to K,
 * then reverse the last subarray (irrespective of its size). You shouldn't return any array,
 * modify the given array in-place.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * N = 5, K = 3
 * arr[] = {1,2,3,4,5}
 * Output: 3 2 1 5 4
 * Explanation: First group consists of elements
 * 1, 2, 3. Second group consists of 4,5.
 * <p>
 * <p>
 * Example 2:
 * <p>
 * Input:
 * N = 4, K = 3
 * arr[] = {5,6,8,9}
 * Output: 8 6 5 9
 * <p>
 * <p>
 * Your Task:
 * You don't need to read input or print anything.
 * The task is to complete the function reverseInGroups() which takes the array,
 * N and K as input parameters and modifies the array in-place.
 * <p>
 * https://practice.geeksforgeeks.org/problems/reverse-array-in-groups0255/1?page=1&difficulty[]=-2&difficulty[]=-1&category[]=Arrays&sortBy=submissions
 */
public class ReverseArrayInGroups {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Original Array::" + list);
        reverseArrayInGroups(list, list.size(), 3);
    }

    public static void reverseArrayInGroups(ArrayList<Integer> a, int n, int k) {

        for (int i = 0; i < n; i = i + k) {
            if (i + k < n) {
                reverse(a, n, i, i + k - 1);
            } else {
                reverse(a, n, i, n - 1);
            }
        }
        System.out.println("Reverse Array In Groups::" + a);
    }

    public static void reverse(ArrayList<Integer> a, int n, int left, int right) {

        while (left < right) {

            int temp = a.get(left);
            a.set(left, a.get(right));
            a.set(right, temp);
            left++;
            right--;
        }
    }
}
