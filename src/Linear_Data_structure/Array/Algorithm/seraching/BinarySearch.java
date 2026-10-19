package Linear_Data_structure.Array.Algorithm.seraching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] a = {1, 4, 6, 8, 10, 12, 15, 20, 25, 30, 68, 70, 90, 100, 200};
        System.out.println(binary(a, 68));

    }

    public static int binary(int[] a, int key) {
        int low = 0, high = a.length - 1;
        while (low <= high) {
            int mid = (high + low) / 2;
            if (a[mid] == key) return mid;
            if (key < a[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
