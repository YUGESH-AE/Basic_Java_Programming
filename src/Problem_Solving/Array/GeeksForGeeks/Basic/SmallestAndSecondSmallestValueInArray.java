package Problem_Solving.Array.GeeksForGeeks.Basic;


/**
 * Find the smallest and second smallest element in an array
 * <p>
 * Given an array of integers, your task is to find the smallest and
 * second smallest element in the array.
 * If smallest and second smallest do not exist, print -1.
 * <p>
 * Example 1:
 * <p>
 * Input :
 * 5
 * 2 4 3 5 6
 * Output :
 * 2 3
 * Explanation:
 * 2 and 3 are respectively the smallest
 * and second smallest elements in the array.
 * <p>
 * Example 2:
 * <p>
 * Input :
 * 6
 * 1 2 1 3 6 7
 * Output :
 * 1 2
 * Explanation:
 * 1 and 2 are respectively the smallest
 * and second smallest elements in the array.
 * <p>
 * Your Task:
 * You don't need to read input or print anything.
 * Your task is to complete the function minAnd2ndMin()
 * which takes the array A[] and its size N as inputs and returns a vector containing
 * the smallest and second smallest element if possible, else return {-1,-1}.
 * <p>
 * https://practice.geeksforgeeks.org/problems/find-the-smallest-and-second-smallest-element-in-an-array3226/1?page=3&difficulty[]=-2&difficulty[]=-1&status[]=unsolved&category[]=Arrays&category[]=Strings&category[]=Linked%20List&category[]=Stack&category[]=Queue&sortBy=submissions
 */
public class SmallestAndSecondSmallestValueInArray {
    public static void main(String[] args) {
        int[] a = {2, 4, 3, 5, 6};
        long[] b = secondSmallest(a, a.length);

        System.out.printf("smallest value:%d second smallest:%d", b[0], b[1]);
    }

    /**
     *
     * Algorithm 1
     *
     */
//    public static long[] secondSmallest(int[] a, int n) {
//
//        long[] value = new long[2];
//        int min1 = a[0];
//        int min2 = Integer.MAX_VALUE;
//        for (int i = 0; i < n; i++) {
//            if (a[i] < min1) {
//                min2 = min1;
//                min1 = a[i];
//            }
//            if (a[i] < min2 && a[i] != min1) {
//                min2 = a[i];
//            }
//        }
//        if (n == 1 || min2 == Integer.MAX_VALUE) {
//            value[0] = -1;
//            value[1] = -1;
//            return value;
//        } else {
//            value[0] = min1;
//            value[1] = min2;
//            return value;
//        }
//    }

    /**
     * Algorithm 2
     */
    public static long[] secondSmallest(int[] a, int n) {

        long[] v = new long[2];

        if (n < 2) {
            v[0] = -1;
            v[1] = -1;
            return v;
        } else {
            int min1 = Integer.MAX_VALUE;
            int min2 = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                if (a[i] < min2) {
                    min2 = a[i];
                }
                if (a[i] < min1) {
                    min2 = min1;
                    min1 = a[i];
                }
            }
            v[0] = min1;
            v[1] = min2;
            return v;
        }
    }
}
