package Linear_Data_structure.Stack;

public class ReverseAString {
    public static void main(String[] args) {
        System.out.println("The reverse of the string is::" + reverseAString("yugesh"));
    }

    public static String reverseAString(String rev) {
        Stack<Character> stack = new Stack<>();
        char[] chars = rev.toCharArray();
        for (char i : chars) {
            stack.push(i);
        }
        for (int i = 0; i < rev.length(); i++) {
            chars[i] = stack.pop();
        }
        return new String(chars);
    }
}
