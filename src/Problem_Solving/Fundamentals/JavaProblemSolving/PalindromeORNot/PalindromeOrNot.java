package Problem_Solving.Fundamentals.JavaProblemSolving.PalindromeORNot;

import java.util.Scanner;

public class PalindromeOrNot {
    static final Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the number");
        int no = s.nextInt();
        palindromeOrNot(no);
    }

    public static void palindromeOrNot(int n) {
        int rev = 0, m = n, temp = n;

        while (n != 0) {
            m = n % 10;
            rev = (rev * 10) + m;
            n = n / 10;
        }

        if (temp == rev) {
            System.out.println(temp + " is Palindrome");
        } else {
            System.out.println(n + " is not a Plaindrome");
        }
    }
}
