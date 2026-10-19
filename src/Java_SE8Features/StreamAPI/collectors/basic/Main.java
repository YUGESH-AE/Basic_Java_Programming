package Java_SE8Features.StreamAPI.collectors.basic;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(10, 20, 30);

        List<Integer> result = numbers.stream()
                .collect(Collectors.toList());

        System.out.println(result);

        List<Integer> numbersSet = List.of(10, 20, 10, 30, 20);

        Set<Integer> resultSet = numbersSet.stream()
                .collect(Collectors.toSet());

        System.out.println(resultSet);

        ArrayList<Integer>list=numbers.stream()
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println(list);

        LinkedHashSet<Integer>linkedHashSet=numbers.stream()
                .collect(Collectors.toCollection(LinkedHashSet::new));

        System.out.println(linkedHashSet);
    }
}
