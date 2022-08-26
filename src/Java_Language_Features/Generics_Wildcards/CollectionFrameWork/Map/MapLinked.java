package Java_Language_Features.Generics_Wildcards.CollectionFrameWork.Map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapLinked {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> tm = new LinkedHashMap<String, Integer>();
        tm.put("a", 100);
        tm.put("b", 200);
        tm.put("c", 300);
        tm.put("d", 400);

        Set<Map.Entry<String, Integer>> st = tm.entrySet();
        for (Map.Entry<String, Integer> me : st) {
            System.out.print(me.getKey() + ":");
            System.out.println(me.getValue());
        }
    }
}

