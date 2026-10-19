package Problem_Solving.Array.GeeksForGeeks.School;


/**
 * Display longest name
 * SchoolAccuracy: 66.29%Submissions: 46K+Points: 0
 * Lamp
 * Land your Dream Job with Mega Job-a-thon. Register Now!
 * <p>
 * Given a list of names, display the longest name.
 * <p>
 * <p>
 * Example:
 * <p>
 * Input:
 * N = 5
 * names[] = { "Geek", "Geeks", "Geeksfor",
 * "GeeksforGeek", "GeeksforGeeks" }
 * <p>
 * Output:
 * GeeksforGeeks
 * <p>
 * <p>
 * Your Task:
 * You don't need to read input or print anything. Your task is to complete the function longest() which takes the array names[] and its size N as inputs and returns the Longest name in the list of names.
 * <p>
 * <p>
 * Expected Time Complexity: O(N)
 * Expected Auxiliary Space: O(1)
 * <p>
 * <p>
 * <p>
 * Constraints:
 * 1 <= N <= 100
 * 1 <= |length of name| <= 1000
 * <p>
 * https://practice.geeksforgeeks.org/problems/display-longest-name0853/1?page=1&difficulty[]=-2&category[]=Arrays&sortBy=submissions
 */
public class Displaylongestname {
    public static void main(String[] args) {
        String[] names = {"Geek", "Geeks", "Geeksfor",
                "GeeksforGeek", "GeeksforGeeks"};

        System.out.println(longest(names, names.length));
    }

    public static String longest(String names[], int n) {

        String val = names[0];
        for (int i = 1; i < n; i++) {
            if (names[i].length() > val.length()) {
                val = names[i];
            }
        }
        return val;
    }
}
