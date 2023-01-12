package FunctionalProgrammingLambda.StreamAPI.Filter_Map_Reduce.Reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceMethod {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        //normal sum
        int sum = 0;
        for (Integer i : list) {
            sum += i;
        }
        System.out.println("sum normal::" + sum);

        //reduce
        Integer sum1 = list.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println("Reduce sum1::" + sum1);

        Optional<Integer> sum2 = list.stream()
                .reduce(Integer::sum);
        System.out.println("Reduce sum2::" + sum2.get());

        //finding max value
        Integer max = list.stream()
                .reduce(0, (a, b) -> a > b ? a : b);
        Optional<Integer> max2 = list.stream()
                .reduce(Integer::max);
        System.out.println("max value::" + max);
        //finding min value
        Integer min = list.stream()
                .reduce(0, (a, b) -> a < b ? a : b);
        Optional<Integer> min2 = list.stream()
                .reduce(Integer::min);
        System.out.println("max value::" + min);
    }
}
