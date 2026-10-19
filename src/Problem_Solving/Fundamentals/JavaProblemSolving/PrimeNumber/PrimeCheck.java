package Problem_Solving.Fundamentals.JavaProblemSolving.PrimeNumber;

import java.util.Scanner;

public class PrimeCheck {
    static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the number to check:");
        int no = sc.nextInt();
        checkPrime(no);
    }

    public static void checkPrime(int number) {
        int m = 0, flag = 0;
        m = number / 2;

        if (number == 0 || number == 1) {
            System.out.println(number + " is not a prime Number");
        } else {
            for (int i = 2; i <= m; i++) {
                if (number % i == 0) {
                    System.out.println(number + " is not prime Number");
                    flag = 1;
                    break;
                }
            }
        }
        if (flag == 0) {
            System.out.println(number + " is a prime number");
        }
    }
}
