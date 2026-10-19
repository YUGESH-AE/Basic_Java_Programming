package Problem_Solving.Array.GeeksForGeeks.School;

import java.util.Arrays;


/**
 * Swap kth elements
 * SchoolAccuracy: 52.76%Submissions: 47K+Points: 0
 * Lamp
 * Land your Dream Job with Mega Job-a-thon. Register Now!
 * <p>
 * Given an array Arr of size N, swap the Kth element from beginning with Kth element from end.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * N = 8, K = 3
 * Arr[] = {1, 2, 3, 4, 5, 6, 7, 8}
 * Output: 1 2 6 4 5 3 7 8
 * Explanation: Kth element from beginning is
 * 3 and from end is 6.
 * Example 2:
 * <p>
 * Input:
 * N = 5, K = 2
 * Arr[] = {5, 3, 6, 1, 2}
 * Output: 5 1 6 3 2
 * Explanation: Kth element from beginning is
 * 3 and from end is 1.
 * Your Task:
 * You don't need to read input or print anything. Your task is to complete the function swapKth() which takes the array of integers arr, n and k as parameters and returns void. You have to modify the array itself.
 * <p>
 * Expected Time Complexity: O(1)
 * Expected Auxiliary Space: O(1)
 * <p>
 * Constraints:
 * 1 ≤ K ≤ N ≤ 105
 * 1 ≤ Arr[i] ≤ 103
 * <p>
 * https://practice.geeksforgeeks.org/problems/swap-kth-elements5500/1?page=1&difficulty[]=-2&category[]=Arrays&sortBy=submissions
 */
public class Swapkthelements {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(Arrays.toString(a));
        swapKth(a, a.length, 3);
        System.out.println(Arrays.toString(a));
    }

    public static void swapKth(int arr[], int n, int k) {
        int low = 0, high = n - 1;
        while (low < k - 1) {
            low++;
            high--;
        }
        int temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;
    }
}
