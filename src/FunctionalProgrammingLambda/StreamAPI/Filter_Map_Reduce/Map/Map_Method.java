package FunctionalProgrammingLambda.StreamAPI.Filter_Map_Reduce.Map;

import java.util.Arrays;
import java.util.List;

public class Map_Method {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        //normal sum
        int sum = 0;
        for (Integer i : list) {
            sum += i;
        }
        System.out.println("sum normal::" + sum);

        //map sum
        int mapSum1 = list.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Map sum1::" + mapSum1);

        int mapSum2 = list.stream()
                .mapToInt(i -> i)
                .sum();
        System.out.println("Map Sum2::" + mapSum2);


    }
}
