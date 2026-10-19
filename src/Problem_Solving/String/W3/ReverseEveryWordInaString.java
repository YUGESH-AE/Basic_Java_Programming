package Problem_Solving.String.W3;


/**
 * Reverse every word in a string using methods
 */
public class ReverseEveryWordInaString {
    public static void main(String[] args) {
        String StrGiven = "This is a test string";
        reverseEveryWord(StrGiven);
    }

    public static void reverseEveryWord(String s) {
        System.out.println("Original String::" + s);
        String reverse = "";
        String[] word = s.split(" ");
        for (String i : word) {
            reverse += reverseWithStringConcat(i) + " ";
        }
        System.out.println("Reversed String::" + reverse);

    }

    public static final String reverseWithStringConcat(String word) {
        String rev = "";
        for (int i = (word.length() - 1); i >= 0; i--) {
            rev += word.charAt(i);
        }
        return rev;
    }
}
