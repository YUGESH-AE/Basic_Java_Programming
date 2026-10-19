package Problem_Solving.Array.W3.Integer;


/**
 * Find the second Largest element in an array
 */
public class SecondLargestElement {
    public static void main(String[] args) {

        secondLarge(new int[]{23, 56, 13, 56, 90, 78});
    }

    public static void secondLarge(int[] a) {
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                secMax = max;
                max = a[i];
            }
            if (a[i] > secMax && a[i] != max) {
                secMax = a[i];
            }
        }
        System.out.println("Second MAximum Element::" + secMax);
    }
}
