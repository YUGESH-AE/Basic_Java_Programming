package FunctionalProgrammingLambda.StreamAPI.Sort.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamSort {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(40);
        list.add(1);
        list.add(2);
        list.add(30);
        list.add(23);

        //sorted in ascending order
        list.stream()
                .sorted()
                .forEach(System.out::println);
        System.out.println();

        //sorted in descending order
        list.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
        System.out.println();
        //sorted using comparator interface
        list.stream()
                .sorted((a, b) -> a.compareTo(b))
                .forEach(System.out::println);
        System.out.println();
        list.stream()
                .sorted((a, b) -> a - b)
                .forEach(System.out::println);
    }
}
