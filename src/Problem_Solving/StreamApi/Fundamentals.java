package Problem_Solving.StreamApi;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Fundamentals {

      public static void main(String[] args) {

        List<Integer>numbers=List.of(10,30,20,50,40,50,30);
        System.out.println(findDuplicateNumbers(numbers));

    }



    public static List<Integer> findEvenNumbers(List<Integer>numbers){
        return numbers
                .stream()
                .filter(n->n%2==0)
                .toList();
    }

    public static List<Integer> findSquareOfEvenNumbers(List<Integer>numbers){

        return numbers
                .stream()
                .filter(n->n%2==0)
                .map(n->n*n)
                .collect(Collectors.toList());
    }

    public static int findSumOfSquaresOfEvenNumbers(List<Integer>numbers){

        return numbers.stream()
                .filter(n->n%2==0)
                .mapToInt(n->n*n)
                .sum();
    }
    public static int findSecondHighestDistinctNumber(List<Integer>numbers){
       return numbers.stream()
               .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(0);
    }
    public static Map<Integer,Long> findFrequencyOfEachNumbers(List<Integer>numbers){
        return numbers
                .stream()
                .collect(
                        Collectors.groupingBy(
                                Function.identity(),
                                Collectors.counting()
                        )
                );
    }
    public static List<Integer> findDuplicateNumbers(List<Integer>numbers){
//        Map<Integer,Long>map=findFrequencyOfEachNumbers(numbers);
//
//        List<Integer> duplicateNumbers=new ArrayList<>();
//        for(Map.Entry<Integer,Long>entry:map.entrySet()){
//            if(entry.getValue()==2){
//                duplicateNumbers.add(entry.getKey());
//            }
//        }
//        return duplicateNumbers;

        return findFrequencyOfEachNumbers(numbers)
                .entrySet()
                .stream()
                .filter(e->e.getValue()>1)
                .map(Map.Entry::getKey)
                .toList();
    }
    
}
