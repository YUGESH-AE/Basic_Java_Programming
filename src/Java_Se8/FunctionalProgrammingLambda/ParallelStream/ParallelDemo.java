package Java_Se8.FunctionalProgrammingLambda.ParallelStream;

import java.util.stream.IntStream;

public class ParallelDemo {
    public static void main(String[] args) {
        long start1 = 0, end1 = 0, end2 = 0, start2 = 0;
        start1 = System.currentTimeMillis();

        IntStream.range(0, 1000)
                .forEach(System.out::println);
        end1 = System.currentTimeMillis();

        System.out.println("***************************************8");
        start2 = System.currentTimeMillis();

        IntStream.range(0, 1000).parallel()
                .forEach(System.out::println);
        end2 = System.currentTimeMillis();
        System.out.println("Time taken for parallel Stream::" + (end2 - start2));
        System.out.println("Time taken for normal Stream::" + (end1 - start1));
    }
}
