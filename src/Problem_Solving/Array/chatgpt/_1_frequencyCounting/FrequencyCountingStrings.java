package Problem_Solving.Array.chatgpt._1_frequencyCounting;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyCountingStrings {
    public static void main(String[] args) {

        System.out.println(isAnagram("listen","silent"));
    }

    public static String firstNonRepeatingCharacter(String str){
        char[]chars=str.toCharArray();
        Map<Character,Integer> map=new LinkedHashMap<>();
        for(char c:chars){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()==1){
                return String.valueOf(entry.getKey());
            }
        }
        return "#";
    }
    public static String firstNonRepeatingCharacter2(String str){
        return Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                )).
                entrySet()
                .stream()
                .filter(v->v.getValue()==1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse("#");
    }

    public static boolean isAnagram(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        Map<Character,Integer>map=new HashMap<>();
        for(char i:s1.toCharArray()){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        for(char i:s2.toCharArray()){
            if(map.containsKey(i)){
               map.put(i,map.get(i)-1);
               if(map.get(i)==0){
                   map.remove(i);
               }
            }else{
                return false;
            }
        }
        return map.isEmpty();
    }
    public static boolean isPalindrome(String str){

        if(str.isEmpty()){
            return false;
        }

        int start=0,end=str.length()-1;

        char[]arr=str.toCharArray();

        while (start<end){
            if(arr[start]!=arr[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }


    public static char highestFrequencyCharacter(String str) {
        // Your implementation
        Map<Character,Integer>map=new LinkedHashMap<>();

        int max=Integer.MIN_VALUE;
        for(char i:str.toCharArray()){
            int count=map.getOrDefault(i,0)+1;
            if(count>max){
                max=count;
            }
            map.put(i,count);
        }

        for(Map.Entry<Character,Integer>m: map.entrySet()){
            if(m.getValue()==max){
                return m.getKey();
            }
        }
        return '*';

    }

}
