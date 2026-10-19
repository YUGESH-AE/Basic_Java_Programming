package Problem_Solving.String.GeeksForGeeks.School;

import java.util.HashSet;
import java.util.Stack;


/**
 * Reversing the vowels
 * SchoolAccuracy: 40.16%Submissions: 27K+Points: 0
 * Lamp
 * Stand out from the crowd. Prepare with Complete Interview Preparation
 * <p>
 * Given a string consisting of lowercase english alphabets, reverse only the vowels present in it and print the resulting string.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * S = "geeksforgeeks"
 * Output: geeksforgeeks
 * Explanation: The vowels are: e, e, o, e, e
 * Reverse of these is also e, e, o, e, e.
 * <p>
 * Example 2:
 * <p>
 * Input:
 * S = "practice"
 * Output: prectica
 * Explanation: The vowels are a, i, e
 * Reverse of these is e, i, a.
 * <p>
 * <p>
 * Example 3:
 * <p>
 * Input:
 * S = "bcdfg"
 * Output: bcdfg
 * Explanation: There are no vowels in S.
 * <p>
 * Your Task:
 * You don't need to read input or print anything. Your task is to complete the function modify() which takes the string S as input and returns the resultant string by reversing only the vowels present in S.
 * <p>
 * <p>
 * Expected Time Complexity: O(|S|).
 * Expected Auxiliary Space: O(|S|).
 * <p>
 * https://practice.geeksforgeeks.org/problems/reversing-the-vowels5304/1?page=1&difficulty[]=-2&category[]=Strings&sortBy=submissions
 * <p>
 * https://www.tutorialcup.com/leetcode-solutions/reverse-vowels-of-a-string-leetcode-solution.htm#:~:text=We%20can%20also%20reverse%20the%20vowels%20in%20single,they%20point%20to%20the%20next%20vowel.%20More%20items
 */
public class ReversingTheVowels {
    public static void main(String[] args) {
        String s = "practice";
        System.out.println("Before Reverse::" + s);
        System.out.println("After Reverse::" + reverseVowels(s));
    }

    public static String reverseVowels(String s) {
        char[] c = s.toCharArray();
        HashSet<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');

        Stack<Character> stack = new Stack<>();

        for (char i : c) {
            if (vowels.contains(i)) {
                stack.push(i);
            }
        }

        for (int i = 0; i < c.length; i++) {
            if (vowels.contains(c[i])) {
                c[i] = stack.pop();
            }
        }

        return new String(c);
    }
}
