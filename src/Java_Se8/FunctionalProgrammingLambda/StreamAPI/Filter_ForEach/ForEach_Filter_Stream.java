package Java_Se8.FunctionalProgrammingLambda.StreamAPI.Filter_ForEach;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEach_Filter_Stream {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Ravi");
        list.add("Suresh");
        list.add("Samjay");
        list.add("Shyam");

        list.stream()
                .forEach(System.out::println);

        list.stream()
                .filter(i -> i.startsWith("S"))
                .forEach(System.out::println);

        Map<Integer, String> map = new HashMap<>();
        map.put(101, "Ravi");
        map.put(104, "Samjay");
        map.put(100, "Sami");
//        map.entrySet().stream().forEach(o->System.out.println(o));
        map.entrySet().stream()
                .filter(k -> k.getKey() % 2 == 0)
                .forEach(System.out::println);
    }
}
