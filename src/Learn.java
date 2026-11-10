import Linear_Data_structure.Array.ArrayList.Array;
import Linear_Data_structure.comparableAndComparator.Employee;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Learn {
    public static void main(String[] args) {





    }
    public static char mostFrequentCharacter(String str) {

        if (str == null || str.isEmpty()) {
            return '*';
        }

        Map<String, Long> map = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                ));

        String result = "";
        long max = 0;

        for (Map.Entry<String, Long> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                result = entry.getKey();
            }
        }

        return result.charAt(0);
    }












}


