package Linear_Data_structure.Array.Implementation;

public class _6_ResizingArray {
    public static void main(String[] args) {
        int[] a = {21, 67, 89, 90};
        int[] result = resizeTheArray(a, a.length * 2);
        printArray(result);

    }

    public static int[] resizeTheArray(int[] a, int capacity) {
        int[] result = new int[capacity];
        for (int i = 0; i < a.length; i++) {
            result[i] = a[i];
        }
        return result;
    }

    public static void printArray(int[] a) {
        for (int i : a) {
            System.out.println(i + " ");
        }
        System.out.println();
    }
}
