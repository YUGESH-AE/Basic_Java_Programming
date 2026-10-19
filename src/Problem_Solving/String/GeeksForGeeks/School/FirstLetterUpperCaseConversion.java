package Problem_Solving.String.GeeksForGeeks.School;


/**
 * Upper case conversion
 * SchoolAccuracy: 38.13%Submissions: 27K+Points: 0
 * Lamp
 * Stand out from the crowd. Prepare with Complete Interview Preparation
 * <p>
 * Given a string str, convert the first letter of each word in the string to uppercase.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * str = "i love programming"
 * Output: "I Love Programming"
 * Explanation:
 * 'I', 'L', 'P' are the first letters of
 * the three words.
 * <p>
 * Your Task:
 * You dont need to read input or print anything. Complete the function transform() which takes s as input parameter and returns the transformed string.
 * <p>
 * <p>
 * Expected Time Complexity: O(N)
 * Expected Auxiliary Space: O(N) to store resultant string
 * <p>
 * <p>
 * Constraints:
 * 1 <= N <= 104
 * The original string str only consists of lowercase alphabets and spaces to separate words.
 * <p>
 * https://practice.geeksforgeeks.org/problems/upper-case-conversion5419/1?page=1&difficulty[]=-2&category[]=Strings&sortBy=submissions
 * <p>
 * https://www.programiz.com/java-programming/examples/capitalize-first-character-of-string
 */
public class FirstLetterUpperCaseConversion {
    public static void main(String[] args) {
        String s = "i am a software developer";
        System.out.println(transform(s));
    }

    public static String transform(String s) {
        char[] c = s.toCharArray();
        boolean foundspace = true;
        for (int i = 0; i < c.length; i++) {
            if (Character.isLetter(c[i])) {
                if (foundspace) {
                    c[i] = Character.toUpperCase(c[i]);
                    foundspace = false;
                }
            } else {
                foundspace = true;
            }
        }
        return new String(c);
    }
}
