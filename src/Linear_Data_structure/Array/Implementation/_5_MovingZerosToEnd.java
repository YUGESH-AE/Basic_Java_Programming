package Linear_Data_structure.Array.Implementation;

public class _5_MovingZerosToEnd {
    public static void main(String[] args) {
        int[] a = {0, 12, 30, 7, 0, 56, 23, 17};
        int[] result = movingZerosToEnd(a);
        printArray(result);
    }

    public static int[] movingZerosToEnd(int[] a) {
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0 && a[j] == 0) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
            if (a[j] != 0) {
                j++;
            }
        }
        return a;
    }

    public static void printArray(int[] a) {
        for (int i : a) {
            System.out.println(i + " ");
        }
        System.out.println();
    }
}
