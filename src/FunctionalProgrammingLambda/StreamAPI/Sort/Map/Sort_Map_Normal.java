package FunctionalProgrammingLambda.StreamAPI.Sort.Map;

import java.util.*;

public class Sort_Map_Normal {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Ravi", 104);
        map.put("Sanjay", 500);
        map.put("Suresh", 100);
        map.put("Aakash", 300);

        List<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
        Collections.sort(entries, ((o1, o2) -> o1.getKey().compareTo(o2.getKey())));

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " =" + entry.getValue());
        }
    }
}
