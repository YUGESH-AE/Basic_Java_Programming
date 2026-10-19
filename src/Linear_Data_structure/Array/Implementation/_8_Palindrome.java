package Linear_Data_structure.Array.Implementation;

public class _8_Palindrome {
    public static void main(String[] args) {
        boolean a = isPalindrome("madam");
        if (a) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }

    public static boolean isPalindrome(String value) {
        char[] a = value.toCharArray();
        int start = 0, end = a.length - 1;
        while (start < end) {
            if (a[start] != a[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
