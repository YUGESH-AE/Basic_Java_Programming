package Problem_Solving.String.W3;


/**
 * Find first non repeating character in a string
 */
public class NonRepeatingCharactersInString {
    public static void main(String[] args) {
        nonRepeatingCharacterInString("prepinsta");
    }

    public static void nonRepeatingCharacterInString(String str) {
        boolean flag = true;
        for (Character i : str.toCharArray()) {
            if (str.indexOf(i) == str.lastIndexOf(i)) {
                System.out.println("First Non Repeating character::" + i);
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("There is no non Repeating characters");
        }
    }
}
