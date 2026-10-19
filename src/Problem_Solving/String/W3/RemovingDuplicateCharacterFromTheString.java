package Problem_Solving.String.W3;

import java.util.LinkedHashSet;
import java.util.Set;


/**
 * Print after removing duplicates from a given string
 */
public class RemovingDuplicateCharacterFromTheString {
    public static void main(String[] args) {
//        removeDupUsingSet(new String("w3resource"));
        removeDuplicatesUsingIndexOf(new String("w3resource"));
    }

    public static void removeDupUsingSet(String str) {
        System.out.println("Original String::" + str);
        char[] a = str.toCharArray();
        Set<Character> set = new LinkedHashSet<>();
        for (char i : a) {
            set.add(i);
        }
        System.out.print("After Removing Duplicates::");
        for (Character i : set) {
            System.out.print(i);
        }
    }

    public static void removeDuplicatesUsingIndexOf(String str) {
        System.out.println("Original String::" + str);
        char[] a = str.toCharArray();
        String target = "";
        for (char i : a) {
            if (target.indexOf(i) == -1) {
                target += i;
            }
        }
        System.out.println("After Removing Duplicates::" + target);
    }
}
