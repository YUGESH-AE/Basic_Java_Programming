package Problem_Solving.StreamApi.interview;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InterviewQuestions {
    public static void main(String[] args) {

        System.out.println(containsDuplicate(new int[]{1, 2, 3, 1}));
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

    public static void printEvenNumbers(List<Integer> numbers){

        numbers.stream()
                .filter(n->n%2==0)
                .forEach(System.out::println);
    }
    public static void printEvenNumbers2(List<Integer> numbers){

        Map<Boolean,List<Integer>>map=numbers
                .stream()
                .collect(
                        Collectors.partitioningBy(n->n%2==0)
                );

        System.out.println(map.get(Boolean.TRUE));
    }

    //need to remember
    public static List<String> findNumbersStartingWithOne(List<Integer> numbers){
        return numbers.stream()
                .map(String::valueOf)
                .filter(s->s.charAt(0)=='1')
                .toList();
    }

    public static void printDuplicateElements(List<Integer> numbers){

         numbers.stream()
                .collect(
                        Collectors.groupingBy(Function.identity(),Collectors.counting())
                )
                .entrySet()
                .stream()
                .filter(n->n.getValue()>=2)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);
    }

    //need to remember
    public static char firstNonRepeatingCharacter(String s) {

        String value = Arrays.stream(s.toLowerCase().split(" "))
                .collect(Collectors.joining());

        return Arrays.stream(value.split(""))
                .map(v -> v.charAt(0))
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .filter(n -> n.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .get();
    }
    //need to remember
    public static char firstRepeatingCharacter(String s) {

        String value = Arrays.stream(s.toLowerCase().split(" "))
                .collect(Collectors.joining());

        return Arrays.stream(value.split(""))
                .map(v -> v.charAt(0))
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .filter(n -> n.getValue()>1 )
                .map(Map.Entry::getKey)
                .findFirst()
                .get();
    }

    public static boolean containsDuplicate(int[] nums){
        return Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(
                                Function.identity(),
                                Collectors.counting()
                        ))
                .values()
                .stream()
                .anyMatch(v->v>=2);
    }
    //need to remember
    public static Stream<String> concatenateStreams(
            List<String> list1, List<String> list2){

        return Stream.concat(list1.stream(),list2.stream());
    }
}
