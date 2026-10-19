package Problem_Solving.Array.GeeksForGeeks.School;


/**
 * Java Arrays | Set 1
 * SchoolAccuracy: 29.17%Submissions: 26K+Points: 0
 * Lamp
 * Land your Dream Job with Mega Job-a-thon. Register Now!
 * <p>
 * For a given array of price of items,you have to calculate the average of all prices upto 2 decimal places.
 * Note: Sum is printed automatically, you only need to calculate and return the average
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input:
 * 5
 * 1 2 3 4 5
 * Output:
 * 15 3.00
 * Explanation:
 * Sum of the array is 15, hence
 * average is 15/5=3.00.
 * <p>
 * Example 2:
 * <p>
 * Input:
 * 9
 * 2 55 85 656 52 554 545 5 2
 * Output:
 * 1956 217.33
 * Explanation:
 * Sum of the array is 1956, hence
 * average is 1956/9= 217.33.
 * <p>
 * <p>
 * Your Task:
 * You don't need to read input or print anything. Your task is to complete the function average() which takes the array A[] and  its size N as inputs and returns the average of all the items as a String.
 * <p>
 * <p>
 * <p>
 * Expected Time Complexity: O(N)
 * Expected Auxiliary Space: O(1)
 * <p>
 * <p>
 * <p>
 * Constraints:
 * 1<=N<=100
 * 1<=Pi<=1000
 * <p>
 * https://practice.geeksforgeeks.org/problems/java-arrays-set-11354/1?page=1&difficulty[]=-2&category[]=Arrays&sortBy=submissions
 */
public class Compute {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        System.out.println(average(a, a.length));
    }

    public static String average(int A[], int N) {
        int sum = 0;
        float avg = 0;
        for (int i = 0; i < N; i++) {
            sum += A[i];
        }
        avg = (float) (sum * 1.0 / N);
        String s = String.format("%.2f", avg);

        return s;
    }
}