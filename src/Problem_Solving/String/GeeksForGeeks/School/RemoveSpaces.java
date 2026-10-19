package Problem_Solving.String.GeeksForGeeks.School;

/**
 * Remove Spaces
 * SchoolAccuracy: 49.21%Submissions: 43K+Points: 0
 * Lamp
 * Stand out from the crowd. Prepare with Complete Interview Preparation
 * <p>
 * Given a string, remove spaces from it.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * S = "geeks  for geeks"
 * Output: geeksforgeeks
 * Explanation: All the spaces have been
 * removed.
 * Example 2:
 * <p>
 * Input:
 * S = "    g f g"
 * Output: gfg
 * Explanation: All the spaces including
 * the leading ones have been removed.
 * <p>
 * Your Task:
 * You don't need to read input or print anything. Your task is to complete the function modify() which takes the string S as input and returns the resultant string by removing all the white spaces from S.
 * <p>
 * <p>
 * Expected Time Complexity: O(|S|).
 * Expected Auxiliary Space: O(1).
 * <p>
 * <p>
 * Constraints:
 * 1<=|S|<=105
 * <p>
 * https://practice.geeksforgeeks.org/problems/remove-spaces0128/1?page=1&difficulty[]=-2&category[]=Strings&sortBy=submissions
 * <p>
 * https://www.studytonight.com/java-programs/java-program-to-remove-all-the-white-space-from-the-string#:~:text=Algorithm%201%20Start%202%20Declare%20a%20string%203,space%20literal%29.%205%20Print%20the%20string%206%20Stop
 */
public class RemoveSpaces {
    public static void main(String[] args) {
        String s = "I am a Software developer at Infosys";
        System.out.println("Before Removing Spaces::" + s);
        System.out.println("After Removing Spaces:: " + removeSpaces2(s));
    }

    public static String removeSpaces1(String s) {
        String str = s.replaceAll("\\s", "");
        return str;
    }

    public static String removeSpaces2(String s){
        StringBuffer stringBuffer=new StringBuffer();
        char[]c=s.toCharArray();
        for(int i=0;i<c.length;i++){
            if((c[i]!= ' ')&&(c[i]!='\t')){
                stringBuffer.append(c[i]);
            }
        }
        return new String(stringBuffer);
    }
}
