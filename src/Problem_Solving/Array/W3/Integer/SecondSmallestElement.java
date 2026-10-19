package Problem_Solving.Array.W3.Integer;


/**
 * Find the second smallest element in an array
 */
public class SecondSmallestElement {
    public static void main(String[] args) {

        secondSmall(new int[]{23, 56, 13, 56, 90, 78});
    }

    public static void secondSmall(int[] a) {
        int min = Integer.MAX_VALUE;
        int secMin = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                secMin = min;
                min = a[i];
            }
            if (a[i] < secMin && a[i] != min) {
                secMin = a[i];
            }
        }
        System.out.println("Second Minimum Element::" + secMin);
    }
}
