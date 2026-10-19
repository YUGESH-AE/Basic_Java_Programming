package Problem_Solving.Array.W3.Integer;


/**
 * Find a missing number in an array
 */
public class MissingNumberInAnArray {
    public static void main(String[] args) {

        missingNoInArray(new int[]{1, 3, 4, 5, 6, 7, 8});
    }

    public static void missingNoInArray(int[] a) {
        int n = a.length + 1;
        int sum = n * (n + 1) / 2;
        for (int i : a) {
            sum -= i;
        }
        System.out.println("Missing No in an array is::" + sum);
    }
}
