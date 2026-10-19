package Problem_Solving.Array.GeeksForGeeks.Basic;


/**
 * Given an array of distinct elements. Find the third largest element in it.
 * <p>
 * Suppose you have A[] = {1, 2, 3, 4, 5, 6, 7}, its output will be 5 because it is the 3 largest element in the array A.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * N = 5
 * A[] = {2,4,1,3,5}
 * Output: 3
 * Example 2:
 * <p>
 * Input:
 * N = 2
 * A[] = {10,2}
 * Output: -1
 * Your Task:
 * Complete the function thirdLargest() which takes the array a[] and the size of the array,
 * n, as input parameters and returns the third largest element in the array.
 * It return -1 if there are less than 3 elements in the given array.
 * <p>
 * https://practice.geeksforgeeks.org/problems/third-largest-element/1?page=2&difficulty[]=-2&difficulty[]=-1&category[]=Arrays&sortBy=submissions
 */
public class ThirdLargestElement {
    public static void main(String[] args) {
        int[] a = {2, 4, 1, 3, 5};
        System.out.println(thirdLarge(a, a.length));
    }

    public static int thirdLarge(int[] a, int n) {
        if (n < 3) {
            return -1;
        } else {
            int big1 = Integer.MIN_VALUE;
            int big2 = Integer.MIN_VALUE;
            int big3 = Integer.MIN_VALUE;

            for (int i = 0; i < n; i++) {
                if (a[i] > big3) {
                    big3 = a[i];
                }
                if (a[i] > big2) {
                    big3 = big2;
                    big2 = a[i];
                }
                if (a[i] > big1) {
                    big2 = big1;
                    big1 = a[i];
                }
            }
            return big3;
        }
    }
}
