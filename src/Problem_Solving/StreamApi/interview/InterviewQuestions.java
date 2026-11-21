package Problem_Solving.StreamApi.interview;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class InterviewQuestions {
    public static void main(String[] args) {

    }

    public static List<Integer> filterEvenNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 2 == 0)
                .toList();
    }

    //need to remember
    public static Optional<Integer> findMaximum(List<Integer> numbers) {
//        return numbers.stream()
//                .max(Comparator.naturalOrder());

        return numbers.stream()
                .max(Integer::compareTo);
    }

    //need to remember
    public static int calculateSum(List<Integer> numbers){

       return numbers.stream()
               .mapToInt(n->n)
               .sum();
    }

    public static List<String> convertToUppercase(List<String> names){

        return names.stream()
                .map(String::toUpperCase)
                .toList();
    }

    //need to remember
    public static List<Integer> sortNumbers(List<Integer> numbers){

        return numbers.stream()
                .sorted(Comparator.naturalOrder())
                .toList();
    }

    public static long countGreaterThanFive(List<Integer> numbers){

        return numbers.stream()
                .filter(n->n>5)
                .count();
    }

    public static List<Integer> getDistinctNumbers(List<Integer> numbers){

        return numbers.stream()
                .distinct()
                .toList();
    }
    public static int reduceToSum(List<Integer> numbers){

        return numbers.stream()
                .reduce(0,Integer::sum);

    }

    public static Optional<Integer> findAnyNumber(List<Integer> numbers){

        return numbers.stream()
                .findAny();
    }

    //need to remember
    public static List<String> getFirstNames(List<String> names){

        return names.stream()
                .map(s->s.split(" "))
                .map(s->s[0])
                .toList();
    }

    public static boolean areAllPositive(List<Integer> numbers){

        return numbers.stream()
                .allMatch(n->n>0);
    }
    public static boolean hasNoNegativeNumbers(List<Integer> numbers){

        return numbers.stream()
                .noneMatch(n->n<0);
    }

    public static Optional<Integer> findFirstNumber(List<Integer> numbers){

        return numbers.stream()
                .findFirst();
    }

    public static List<Integer> flattenList(List<List<Integer>> numbers){

        return numbers.stream()
                .flatMap(Collection::stream)
                .toList();
    }

    public static Map<Integer, List<Users>> groupUsersByAge(List<Users> users){

        return users.stream()
                .collect(
                        Collectors.groupingBy(Users::age)
                );
    }

    //need to remember
    public static List<Integer> peekElements(List<Integer> numbers){
        return numbers.stream()
                .peek(System.out::println)
                .toList();
    }

    public static List<Integer> limitElements(List<Integer> numbers){

        return numbers.stream()
                .limit(3)
                .toList();
    }

    public static List<Integer> skipElements(List<Integer> numbers){
        return numbers.stream()
                .skip(2)
                .toList();
    }

    public static Set<Integer> convertToSet(List<Integer> numbers){

        return numbers.stream()
                .collect(Collectors.toSet());
    }

    public static IntSummaryStatistics getStatistics(List<Integer> numbers){

        return numbers.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();
    }
}
