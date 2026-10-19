package Problem_Solving.Array.W3.Integer;

/**
 * Test the equality of two arrays
 */
public class EqualityOfTwoArrays {
    public static void main(String[] args) {
        int[] array1 = {2, 5, 7, 9, 11};
        int[] array2 = {2, 5, 7, 9, 11};
        equalityOfArrays(array1, array2);
    }

    public static void equalityOfArrays(int[] a, int[] b) {
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                result = 1;
            }
        }
        if (result == 0) {
            System.out.println("Arrays are same");
        } else {
            System.out.println("Arrays are different");
        }
    }
}
