package Problem_Solving.Array.W3.Integer;


/**
 * Find all Pairs of elements in an array
 * whose sum is equal to a specified number
 */
public class AllPairsWhoseSumis {

    public static void main(String[] args) {
        sumOfArraySpecificValue(new int[]{2, 7, 4, -5, 11, 5, 20}, 15);

    }

    public static void sumOfArraySpecificValue(int[] a, int val) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < a.length; j++) {
                if (a[i] + a[j] == val) {
                    System.out.println(a[i] + "+" + a[j] + "=" + val);
                }
            }
        }
    }
}
