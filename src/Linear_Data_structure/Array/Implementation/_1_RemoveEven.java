package Linear_Data_structure.Array.Implementation;

public class _1_RemoveEven {
    public static void main(String[] args) {
        int[] a = {2, 4, 2, 6, 7, 9, 11, 22};
        int[] result = removeEven(a);
        printArray(result);
    }

    public static void printArray(int[] a) {
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int[] removeEven(int[] a) {
        int oddCount = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                oddCount++;
            }
        }
        int[] result = new int[oddCount];
        int idx = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                result[idx] = a[i];
                idx++;
            }
        }
        return result;
    }
}
