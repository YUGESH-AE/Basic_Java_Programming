package Java_Se8.Java_Language_Features.Generics_Collections.CollectionFrameWork.Map;

import java.util.*;

public class MapHash {


    public static void main(String args[]) {
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        hm.put("a", 100);
        hm.put("b", 200);
        hm.put("c", 300);
        hm.put("d", 400);
        hm.put(null, null);

        Set<Map.Entry<String, Integer>> st = hm.entrySet();  //returns Set view
        for (Map.Entry<String, Integer> me : st) {
            System.out.print(me.getKey() + ":");
            System.out.println(me.getValue());
        }

        for(Map.Entry<String,Integer>ma:hm.entrySet()){
            System.out.println(ma);
        }
    }
}


