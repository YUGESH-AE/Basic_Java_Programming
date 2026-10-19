package Linear_Data_structure.Array.Implementation;

public class _4_SecondMaxValue {
    public static void main(String[] args) {
        int[] arr = {13, 34, 2, 34, 33, 1, 14};
        System.out.println(secodMaxValue(arr));
    }

    public static int secodMaxValue(int[] arr) {
        int max = arr[0];
        int secondMax = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }
}
