package Problem_Solving.Array.W3.Integer;


/**
 * Count the two elements of two given arrays of
 * integers with same length, differ by 1 or less.
 */
public class CountArrayOfSameLengthResultSumLessOREqualONE {
    public static void main(String[] args) {
        int[] a = {10, 11, 10, 20, 43, 20, 50};
        int[] b = {10, 13, 11, 20, 44, 30, 50};
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (Math.abs(a[i] - b[i]) <= 1 && a[i] != b[i]) {
                count++;
            }
        }
        System.out.println("sum::" + count);
    }
}


