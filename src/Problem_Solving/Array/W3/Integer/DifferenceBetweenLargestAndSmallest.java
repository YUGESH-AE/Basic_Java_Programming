package Problem_Solving.Array.W3.Integer;


/**
 * 1.Get the difference between the largest and smallest values in an array of integers
 * <p>
 * 2.Compute the average value of an array of integers except the largest and smallest values
 */
public class DifferenceBetweenLargestAndSmallest {
    public static void main(String[] args) {
        int[] array_nums = {5, 7, 2, 4, 9};
        differenceBetweenArray(array_nums);
        average(array_nums);
    }

    public static void differenceBetweenArray(int[] a) {
        int min = a[0], max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            } else if (a[i] < min) {
                min = a[i];
            }
        }
        int dif = max - min;
        System.out.printf("Difference between min:%d max:%d is::%d \n", min, max, dif);

    }

    public static void average(int[] a) {
        int min = a[0], max = a[0], sum = a[0];
        for (int i = 1; i < a.length; i++) {
            sum += a[i];
            if (a[i] < min) {
                min = a[i];
            } else if (a[i] > max) {
                max = a[i];
            }
        }
        double avg = (sum - min - max) / (a.length - 2);
        System.out.println("The average of an array without max and min value is:" + avg);
    }
}
