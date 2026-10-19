package Linear_Data_structure.Array.Implementation;

public class _7_MissingNoNumberInSwquence {
    public static void main(String[] args) {
        int[] a = {1, 8, 3, 6, 2, 7, 4};
        System.out.println("the missing no in the sequence is::->" + missingNumber(a));
    }

    public static int missingNumber(int[] a) {
        int n = a.length + 1;
        int sum = n * (n + 1) / 2;
        for (int num : a) {
            sum = sum - num;
        }
        return sum;
    }
}
