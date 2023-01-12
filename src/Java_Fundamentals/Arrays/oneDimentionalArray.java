package Java_Fundamentals.Arrays;

public class oneDimentionalArray {
    public static void main(String[] args) {
        int[] n = new int[4];

        for (int i = 0; i < n.length; i++) {
            n[i] = (int) (Math.random() * 10);
        }
        for (int i : n) {
            System.out.println(i);
        }
    }
}
