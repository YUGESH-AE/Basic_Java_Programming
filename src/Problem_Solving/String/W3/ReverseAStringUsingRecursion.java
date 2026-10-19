package Problem_Solving.String.W3;

/**
 * Reversing a String
 */

import Linear_Data_structure.Stack.Stack;

public class ReverseAStringUsingRecursion {
    public static void main(String[] args) {
//        String str1 = "The quick brown fox jumps";
        String str1 = "abcd";
        System.out.println("The given string is: " + str1);
        System.out.println("The string in reverse order is:");
//        reverseString(str1);
        reverseUsingStack(str1);
    }

    /**
     * Reverse a string using recursion
     */
    public static void reverseString(String str1) {
        if ((str1 == null) || (str1.length() <= 1))
            System.out.println(str1);
        else {
            System.out.print(str1.charAt(str1.length() - 1));
            reverseString(str1.substring(0, str1.length() - 1));
        }
    }

    /**
     * Reverse a string using stack
     */
    public static void reverseUsingStack(String s) {
        System.out.println("Original String::" + s);
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (Character i : chars) {
            stack.push(i);
        }
        for (int i = 0; i < chars.length; i++) {
            chars[i] = stack.pop();
        }
        System.out.println("Reversed String::" + new String(chars));
    }
}
