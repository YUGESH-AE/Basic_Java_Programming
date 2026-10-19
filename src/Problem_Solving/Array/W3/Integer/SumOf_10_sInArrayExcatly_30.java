package Problem_Solving.Array.W3.Integer;


/**
 * Check if the sum of all the 10's in the array is exactly 30
 */
public class SumOf_10_sInArrayExcatly_30 {
    public static void main(String[] args) {
        int[] array_nums = {10, 77, 10, 54, -11, 10};
        excatlyThirty(array_nums);
    }

    public static void excatlyThirty(int[] a) {
        int sum = 0;
        for (int i : a) {
            if (i == 10) {
                sum += i;
            }
        }
        if (sum == 30) {
            System.out.println("Sum of 10's is exactly 30");
        } else {
            System.out.println("Sum of 10's is not exactly 30");
        }
    }
}
