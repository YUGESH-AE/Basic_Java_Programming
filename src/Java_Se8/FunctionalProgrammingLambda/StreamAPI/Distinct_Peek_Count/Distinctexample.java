package Java_Se8.FunctionalProgrammingLambda.StreamAPI.Distinct_Peek_Count;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Distinctexample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Ravi", "Shyam", "Ravi", "Shyam", "Sundar");

        List<String> dis = list
                .stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(dis);

        //peek method is for logging and debugging
        long coun = list.stream()
                .distinct()
                .peek(System.out::println)
                .count();
        System.out.println("Count::" + coun);
    }
}
