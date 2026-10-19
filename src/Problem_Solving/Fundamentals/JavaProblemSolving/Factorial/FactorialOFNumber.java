package Problem_Solving.Fundamentals.JavaProblemSolving.Factorial;

import java.util.Scanner;

public class FactorialOFNumber {
    static final Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the no to find factorial:");
        int n = s.nextInt();
        factorialFind(n);
    }

    public static void factorialFind(int n) {
        int fact = 1, m = n;

        while (n != 0) {
            fact = fact * n;
            n--;
        }
        System.out.println("Factorial of " + m + " is " + fact);
    }
}
