package Linear_Data_structure.Array.Implementation;

public class _3_MinValueInArray {
    public static void main(String[] args) {
        int[] arr = {12, 5, 7, 9, 3, 2, 56, 1};
        System.out.println(miniValue(arr));
    }

    public static int miniValue(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Invalid input");
        }
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
