package Java_Se8.FunctionalProgrammingLambda.ExceptionalHandling;

import java.util.Arrays;
import java.util.List;

public class ConvertingStringListToInteger {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("1", "2", "3", "4", "5", "6ui");

//        List<Integer>integerList=list.stream()
//                .map(Integer::parseInt)
//                .collect(Collectors.toList());
//        integerList.forEach(System.out::println);

        list.forEach(ConvertingStringListToInteger::printList);


    }

    public static void printList(String s) {
        try {
            System.out.println(Integer.parseInt(s));
        } catch (Exception e) {
            System.out.println("String value cannot be converted to intger");
        }
    }
}
