package Problem_Solving.Array.GeeksForGeeks.School;

public class SumofNNaturalNumbersLongDataType {

    public static void main(String[] args) {
        System.out.println(sumOfNatural(126465741));
    }

    public static long sumOfNatural(int n) {
        long sum = ((long) n * ((long) n + 1)) / 2;
        return sum;
    }
}
