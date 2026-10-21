package Java_SE8Features.StreamAPI.collectors.partitionBy;


import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Integer>list= List.of(1,2,3,4,5,6,7,8,9,10);

        //overload 1
        Map<Boolean,List<Integer>>evenOddMap=
                list.stream()
                        .collect(
                                Collectors.partitioningBy(i->i%2==0)
                        );

        System.out.println(evenOddMap);
        System.out.println("Even"+evenOddMap.get(true));
        System.out.println("Odd"+evenOddMap.get(false));

        //Overload 2
        Map<Boolean,Long>evenOddCountMap=
                list.stream()
                        .collect(
                                Collectors.partitioningBy(
                                        i->i%2==0,
                                        Collectors.counting()
                                )
                        );

        System.out.println(evenOddCountMap);

        Map<Boolean,Integer>evenOddSumMap=
                list.stream()
                        .collect(
                                Collectors.partitioningBy(
                                        i->i%2==0,
                                        Collectors.summingInt(Integer::intValue)
                                )
                        );
        System.out.println(evenOddSumMap);
    }
}
