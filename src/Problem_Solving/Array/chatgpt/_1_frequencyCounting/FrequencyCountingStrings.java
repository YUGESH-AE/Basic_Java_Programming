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

     public static String commonCharacters(String s1, String s2) {
        StringBuilder sb=new StringBuilder();
        
        String max;
        String min;
        int maxLength=0,minLength=0;
        if(s1.length()>s2.length()){
            maxLength=s1.length();
            max= s1;
            minLength=s2.length();
            min=s2;
        }else {
            maxLength=s2.length();
            max=s2;
            minLength=s1.length();
            min=s1;
            
        }

        Map<Character,Integer>map=new HashMap<>();
        for(int i=0;i<maxLength;i++){
            map.put(max.charAt(i),map.getOrDefault(max.charAt(i),0)+1);
        }
        
        for(int i=0;i<minLength;i++){
            if(map.containsKey(min.charAt(i))){
                sb.append(min.charAt(i));
                map.put(min.charAt(i),map.getOrDefault(min.charAt(i),0)-1);
                if(map.get(min.charAt(i))==0){
                    map.remove(min.charAt(i));
                }
            }
        }
        return sb.toString();
        
    }

     public static boolean canConstruct(String ransomNote, String magazine){

        Map<Character,Integer>map=new HashMap<>();
        for(int i=0;i<magazine.length();i++){
            map.put(magazine.charAt(i),map.getOrDefault(magazine.charAt(i),0)+1);
        }

        for(int i=0;i<ransomNote.length();i++){
            char n=ransomNote.charAt(i);
            if(!map.containsKey(n)){
                return false;
            }
            map.put(n,map.getOrDefault(n,0)-1);
            if(map.get(n)==0){
                map.remove(n);
            }
        }
        return true;
    }

    public static boolean isIsomorphic(String s,String t){
        if(s.length()!=t.length()){
            return false;
        }
        Map<Character,Character>map1=new HashMap<>();
        Map<Character,Character>map2=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            char b=t.charAt(i);

            if(!map1.containsKey(a)){
                map1.put(a,b);
            }else{
                Character n=map1.get(a);
                if(!n.equals(b)){
                    return false;
                }
            }

            if(!map2.containsKey(b)){
                map2.put(b,a);
            }else {
                Character n=map2.get(b);
                if(!n.equals(a)){
                    return false;
                }
            }
        }
        return true;

    }

     public static int firstUniqChar(String str) {
        if(str.isEmpty()||str==null){
            return -1;
        }
        Map<Character,Long>map=new HashMap<>();

        for(char i:str.toCharArray()){
            map.put(i,map.getOrDefault(i,0L)+1);
        }

        for(int i=0;i<str.length();i++){
            if(map.get(str.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
     public static String frequencySorting(String str){
        Map<Character,Long>map=new HashMap<>();
        for(char i:str.toCharArray()){
            map.put(i,map.getOrDefault(i,0L)+1);
        }

        PriorityQueue<Map.Entry<Character,Long>>pq=
                new PriorityQueue<>((a,b)->b.getValue().compareTo(a.getValue()));

        pq.addAll(map.entrySet());

        StringBuilder sb=new StringBuilder();

        while (!pq.isEmpty()){
            Map.Entry<Character,Long>m=pq.poll();
            for(int i=0;i<m.getValue();i++){
                sb.append(m.getKey());
            }
        }
        return sb.toString();
    }

}
