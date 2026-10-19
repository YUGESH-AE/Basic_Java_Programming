package Problem_Solving.Array.GeeksForGeeks.School;

import java.util.Arrays;


/**
 * Perfect Arrays
 * SchoolAccuracy: 43.54%Submissions: 31K+Points: 0
 * Lamp
 * Land your Dream Job with Mega Job-a-thon. Register Now!
 * <p>
 * Given an array of size N and you have to tell whether the array is perfect or not. An array is said to be perfect if it's reverse array matches the original array. If the array is perfect then print "PERFECT" else print "NOT PERFECT".
 * <p>
 * Example 1:
 * <p>
 * Input : Arr[] = {1, 2, 3, 2, 1}
 * Output : PERFECT
 * Explanation:
 * Here we can see we have [1, 2, 3, 2, 1]
 * if we reverse it we can find [1, 2, 3, 2, 1]
 * which is the same as before.
 * So, the answer is PERFECT.
 * <p>
 * Example 2:
 * <p>
 * Input : Arr[] = {1, 2, 3, 4, 5}
 * Output : NOT PERFECT
 * <p>
 * User Task:
 * The task is to complete the function IsPerfect(), which takes an array (a), size of the array (n), and return the boolean value true if it Perfect else false. The drivercode automatically adds a new line.
 * <p>
 * Expected Time Complexity: O(N).
 * Expected Auxiliary Space: O(1).
 * <p>
 * Constraints:
 * 1 ≤ N ≤ 105
 * 1 ≤ ai ≤ 103
 * <p>
 * https://practice.geeksforgeeks.org/problems/perfect-arrays4645/1?page=1&difficulty[]=-2&category[]=Arrays&sortBy=submissions
 */
public class PerfectArrays {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 2, 1};
        if (IsPerfect(a, a.length)) {
            System.out.println("PERFECT");
        } else {
            System.out.println("NOT PERFECT");
        }
    }

    public static boolean IsPerfect(int a[], int n) {
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            temp[i] = a[i];
        }
        int start = 0, end = n - 1;
        while (start < end) {
            int te = a[start];
            a[start] = a[end];
            a[end] = te;
            start++;
            end--;
        }

        if (Arrays.equals(temp, a)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsPerfect2(int a[], int n) {
        for (int i = 0; i < n / 2; i++) {
            if (a[n - i - 1] != a[i])
                return false;
        }
        return true;
    }
}
