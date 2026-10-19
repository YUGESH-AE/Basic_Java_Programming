package Linear_Data_structure.Array.Implementation;

public class _2_ReverseArray {
    public static void main(String[] args) {
        int[] a = {2, 4, 2, 6, 7, 9, 11, 22};
        int[] result = reverseArray(a, 0, a.length - 1);
        printArray(result);
    }

    public static void printArray(int[] a) {
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int[] reverseArray(int[] a, int start, int end) {
        while (start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
        return a;

    }
}
