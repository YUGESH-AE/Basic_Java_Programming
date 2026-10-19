package Problem_Solving.String.W3;


/**
 * Replace each substring of a given string
 * that matches the given regular expression with the given replacement
 */
public class ReplaceAWord {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog.";
        System.out.println(str.replaceFirst("fox", "cat"));
    }
}
