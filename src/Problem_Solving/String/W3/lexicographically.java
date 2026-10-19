package Problem_Solving.String.W3;


/**
 * Compare two strings lexicographically
 * <p>
 * Write a Java program to compare two strings lexicographically.
 * Two strings are lexicographically equal if they are the same length
 * and contain the same characters in the same positions.
 */
public class lexicographically {
    public static void main(String[] args) {
        String str1 = "This is Exercise 1";
        String str2 = "This is Exercise 1";
        stringLexicography(str1, str2);
    }

    public static void stringLexicography(String s1, String s2) {
        if (s1.length() == s2.length()) {
//            char[]a=s1.toCharArray();
//            char[]b=s2.toCharArray();
//            int result=0;
//            for(int i=0;i<s1.length();i++){
//                if(a[i]!=b[i]){
//                    result=1;
//                }
//            }
//            if(result==1){
//                System.out.println("Not a Lexicographically equal String");
//
//            }else {
//                System.out.println("Lexicographically equal String");
//            }
            if (s1.equalsIgnoreCase(s2)) {
                System.out.println("Lexicographically equal String");
            } else {
                System.out.println("Not a Lexicographically equal String");
            }
        } else {
            System.out.println("Not a Lexicographically equal String");
        }
    }
}
