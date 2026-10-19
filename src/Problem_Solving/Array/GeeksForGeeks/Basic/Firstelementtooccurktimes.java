package Problem_Solving.Array.GeeksForGeeks.Basic;

import java.util.HashMap;


/**
 * First element to occur k times
 * BasicAccuracy: 37.11%Submissions: 96K+Points: 1
 * Lamp
 * Land your Dream Job with Mega Job-a-thon. Register Now!
 * <p>
 * Given an array of N integers.
 * Find the first element that occurs at least K number of times.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input :
 * N = 7, K = 2
 * A[] = {1, 7, 4, 3, 4, 8, 7}
 * Output :
 * 4
 * Explanation:
 * Both 7 and 4 occur 2 times.
 * But 4 is first that occurs 2 times
 * As at index = 4, 4 has occurred
 * atleast 2 times whereas at index = 6,
 * 7 has occurred atleast 2 times.
 * <p>
 * <p>
 * Your Task:
 * You don't need to read input or print anything.
 * Your task is to complete the function firstElementKTime()
 * which takes the array A[], its size N,
 * and an integer K as inputs and returns the required answer.
 * If the answer is not present in the array, return -1.
 * <p>
 * Expected Time Complexity: O(N)
 * Expected Auxiliary Space: O(N)
 * <p>
 * Constraints:
 * 1 <= N <= 104
 * 1 <= K <= 100
 * 1<= A[i] <= 200
 * <p>
 * <p>
 * https://practice.geeksforgeeks.org/problems/first-element-to-occur-k-times5150/1?page=2&difficulty[]=-2&difficulty[]=-1&category[]=Arrays&category[]=Strings&sortBy=submissions
 */
public class Firstelementtooccurktimes {
    public static void main(String[] args) {
        int[] a = {1, 7, 4, 3, 4, 8, 7};
        System.out.println(firstElementKTime(a, a.length, 2));
    }

    public static int firstElementKTime(int[] a, int n, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (hm.containsKey(a[i])) {
                hm.put(a[i], hm.get(a[i]) + 1);
            } else {
                hm.put(a[i], 1);
            }

            if (hm.get(a[i]) == k) {
                return a[i];
            }
        }
        return -1;
    }
}
