package Problem_Solving.Array.GeeksForGeeks.School;

import java.util.Arrays;

/**
 * At least two greater elements
 * SchoolAccuracy: 58.49%Submissions: 31K+Points: 0
 * Lamp
 * Land your Dream Job with Mega Job-a-thon. Register Now!
 * <p>
 * Given an array of N distinct elements, the task is to find all elements in array except two greatest elements in sorted order.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input :
 * a[] = {2, 8, 7, 1, 5}
 * Output :
 * 1 2 5
 * Explanation :
 * The output three elements have two or
 * more greater elements.
 * Example 2:
 * <p>
 * Input :
 * a[] = {7, -2, 3, 4, 9, -1}
 * Output :
 * -2 -1 3 4
 * <p>
 * Your Task:
 * You don't need to read input or print anything. Your task is to complete the function findElements() which takes the array A[] and its size N as inputs and return the vector sorted values denoting the elements in array which have at-least two greater elements than themselves.
 * <p>
 * Expected Time Complexity: O(N*Log(N))
 * Expected Auxiliary Space: O(N)
 * <p>
 * Constraints:
 * 3 ≤ N ≤ 105
 * -106 ≤ Ai ≤ 106
 * <p>
 * https://practice.geeksforgeeks.org/problems/at-least-two-greater-elements4625/1?page=1&difficulty[]=-2&category[]=Arrays&sortBy=submissions
 */
public class Atleasttwogreaterelements {
    public static void main(String[] args) {
        long[] a = {2, 8, 7, 1, 5};
        System.out.println(Arrays.toString(findElements(a, a.length)));
    }

    public static long[] findElements(long a[], long n) {
        Arrays.sort(a);
        long max = a[0];
        long sec = (long) Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                sec = max;
                max = a[i];
            }
            if (a[i] > sec && a[i] != max) {
                sec = a[i];
            }
        }
        long[] temp = new long[(int) (n - 2)];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] != max && a[i] != sec) {
                temp[j] = a[i];
                j++;
            }
        }
        return temp;

    }
}
