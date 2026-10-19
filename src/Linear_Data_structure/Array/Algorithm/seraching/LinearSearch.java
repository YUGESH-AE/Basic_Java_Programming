package Linear_Data_structure.Array.Algorithm.seraching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] a = {12, 34, 67, 2, 6, 8, 34, 4};
        System.out.println(linear(a, 4));
    }

    public static int linear(int[] a, int x) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                return i;
            }
        }
        return -1;
    }
}
