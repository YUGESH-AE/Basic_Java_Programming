package Problem_Solving.Array.GeeksForGeeks.Basic;

import java.util.ArrayList;


/**
 * First and last occurrences of x
 * <p>
 * Given a sorted array arr containing n elements with possibly duplicate elements,
 * the task is to find indexes of first and last occurrences of an element x in the given array.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * n=9, x=5
 * arr[] = { 1, 3, 5, 5, 5, 5, 67, 123, 125 }
 * Output:  2 5
 * Explanation: First occurrence of 5 is at index 2 and last
 * occurrence of 5 is at index 5.
 * <p>
 * Example 2:
 * <p>
 * Input:
 * n=9, x=7
 * arr[] = { 1, 3, 5, 5, 5, 5, 7, 123, 125 }
 * Output:  6 6
 * <p>
 * Your Task:
 * Since, this is a function problem. You don't need to take any input,
 * as it is already accomplished by the driver code.
 * You just need to complete the function find() that takes array arr,
 * integer n and integer x as parameters and returns the required answer.
 * Note: If the number x is not found in the array just return both index as -1.
 * <p>
 * https://practice.geeksforgeeks.org/problems/first-and-last-occurrences-of-x3116/1?page=1&difficulty[]=-2&difficulty[]=-1&category[]=Arrays&sortBy=submissions
 */
public class FirstAndLastOccurrencesOfX {
    public static void main(String[] args) {
        long[] a = {2, 1, 5, 6, 5, 5, 5, 7, 7, 5};
        ArrayList<Long> list = firstLastOccurence(a, a.length, 3);
        list.forEach(i -> System.out.print(i + " "));
    }

    public static ArrayList<Long> firstLastOccurence(long[] a, int n, int x) {

        ArrayList<Long> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (a[i] == x) {
                list.add((long) i);
                break;
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            if (a[i] == x) {
                list.add((long) i);
                break;
            }
        }

        if (!list.isEmpty()) {
            return list;
        } else {
            list.add((long) -1);
            list.add((long) -1);
            return list;
        }
    }
}
