package Problem_Solving.Array.GeeksForGeeks.Basic;


/**
 * https://practice.geeksforgeeks.org/problems/replace-all-0s-with-5/1?page=2&difficulty[]=-2&difficulty[]=-1&category[]=Arrays&sortBy=submissions
 * <p>
 * https://www.geeksforgeeks.org/replace-0-5-input-integer/
 */
public class Replace0With5InInteger {
    public static void main(String[] args) {
        System.out.println(replace0To5(1004));
    }

    public static int replace0To5(int num) {
        if (num == 0) {
            return 5;
        } else {
            int rev = 0, m = 0;
            while (num != 0) {
                m = num % 10;
                if (m == 0) {
                    m = 5;
                }
                rev = (rev * 10) + m;
                num = num / 10;
            }
            return reverseNumber(rev);
        }
    }

    public static int reverseNumber(int num) {

        int rev = 0, m = 0;
        while (num != 0) {
            m = num % 10;
            rev = (rev * 10) + m;
            num = num / 10;
        }
        return rev;
    }
}
