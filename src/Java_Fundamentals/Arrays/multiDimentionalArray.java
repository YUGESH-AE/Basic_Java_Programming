package Java_Fundamentals.Arrays;

public class multiDimentionalArray {
    public static void main(String[] args) {

        int[][] n = new int[4][3];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                n[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int i[] : n) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
