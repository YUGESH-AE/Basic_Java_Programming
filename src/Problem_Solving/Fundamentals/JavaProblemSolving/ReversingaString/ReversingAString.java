package Problem_Solving.Fundamentals.JavaProblemSolving.ReversingaString;

import java.util.Scanner;

public class ReversingAString {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input a string: ");
        char[] letters = s.nextLine().toCharArray();
        System.out.print("Reverse string: ");
        for (int i = letters.length - 1; i >= 0; i--) {
            System.out.print(letters[i]);
        }
        System.out.print("\n");

    }
}
