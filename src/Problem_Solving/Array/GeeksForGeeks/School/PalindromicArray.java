package Problem_Solving.Array.GeeksForGeeks.School;


/**
 * Given a Integer array A[] of n elements. Your task is to complete the function PalinArray.
 * Which will return 1 if all the elements of the Array are palindrome otherwise it will return 0.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * 5
 * 111 222 333 444 555
 * <p>
 * Output:
 * 1
 * <p>
 * Explanation:
 * A[0] = 111 //which is a palindrome number.
 * A[1] = 222 //which is a palindrome number.
 * A[2] = 333 //which is a palindrome number.
 * A[3] = 444 //which is a palindrome number.
 * A[4] = 555 //which is a palindrome number.
 * As all numbers are palindrome so This will return 1.
 * <p>
 * Input:
 * 3
 * 121 131 20
 * <p>
 * Output:
 * 0
 * <p>
 * Explanation:
 * 20 is not a palindrome hence the output is 0.
 * <p>
 * https://practice.geeksforgeeks.org/problems/palindromic-array-1587115620/1?page=2&difficulty[]=-2&difficulty[]=-1&category[]=Arrays&sortBy=submissions
 */
public class PalindromicArray {
    public static void main(String[] args) {
        int[] a = {111, 222, 333, 444, 515};
        int v = palinArray(a, a.length);
        if (v == 1) {
            System.out.println("palindrome");
        } else {
            System.out.println("not a palindrome");
        }
    }

    public static int palinArray(int[] a, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (check(a[i]) == 1) {
                count++;
            }
        }
        if (count == n) {
            return 1;
        }
        return 0;
    }

    public static int check(int n) {
        int rev = 0, m = 0, v = n;
        while (n != 0) {
            m = n % 10;
            rev = (rev * 10) + m;
            n = n / 10;
        }
        if (rev == v) {
            return 1;
        }
        return 0;
    }
}
