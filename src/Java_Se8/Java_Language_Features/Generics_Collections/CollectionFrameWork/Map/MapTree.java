package Java_Se8.Java_Language_Features.Generics_Collections.CollectionFrameWork.Map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapTree {
    public static void main(String args[])
    {
        TreeMap<String,Integer> tm = new TreeMap<String,Integer>();
        tm.put("a",100);
        tm.put("b",200);
        tm.put("c",300);
        tm.put("d",400);
//        tm.put(null,null);

        Set<Map.Entry<String,Integer>> st = tm.entrySet();
        for(Map.Entry<String,Integer> me:st)
        {
            System.out.print(me.getKey()+":");
            System.out.println(me.getValue());
        }
    }
}
