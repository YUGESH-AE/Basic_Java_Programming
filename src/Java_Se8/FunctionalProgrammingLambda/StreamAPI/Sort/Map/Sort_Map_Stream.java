package Java_Se8.FunctionalProgrammingLambda.StreamAPI.Sort.Map;

import java.util.HashMap;
import java.util.Map;

public class Sort_Map_Stream {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Ravi", 104);
        map.put("Sanjay", 500);
        map.put("Suresh", 100);
        map.put("Aakash", 300);

        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(System.out::println);
        System.out.println("****************************");
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);
    }
}
