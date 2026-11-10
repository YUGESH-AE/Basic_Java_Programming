package Problem_Solving.Array.chatgpt._1_frequencyCounting;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyCountingNumbers {
    public static void main(String[] args) {


    }
    public static List<Integer> findTheDuplicateElements(int[]arr){
        Set<Integer> set=new HashSet<>();
        Set<Integer>list=new LinkedHashSet<>();

        for(int i:arr){
            if(!set.add(i)){
                list.add(i);
            }
        }
        return new ArrayList<>(list);
    }
    public static List<Integer>findTheDuplicateElements2(int[]arr){
        Set<Integer>set=new HashSet<>();
        return Arrays.stream(arr)
                .boxed()
                .filter(i->!set.add(i))
                .collect(Collectors.toSet())
                .stream()
                .toList();
    }

    public static int findTheMostFrequentElement(int[]arr){

        return Arrays.stream(arr)
                .boxed()
                .collect(
                        Collectors.groupingBy(
                                Function.identity(),
                                Collectors.counting()
                        )
                ).entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .get()
                .getKey();
    }
    public static int findTheMostFrequentElement2(int[]arr){
       Map<Integer,Integer>map=new HashMap<>();
       for(int i:arr){
           map.put(i,map.getOrDefault(i,0)+1);
       }
       int maxCount=0,maxValue=0;
       for(Map.Entry<Integer,Integer>entry:map.entrySet()){
           if(entry.getValue()>maxCount){
               maxCount=entry.getValue();
               maxValue=entry.getKey();
           }

       }
       return maxValue;
    }
    public static List<Integer> twoSum(int[]arr,int target){

      Map<Integer,Integer>map=new HashMap<>();
      List<Integer>result=new ArrayList<>();

      for(int i=0;i<arr.length;i++){

          int diff=target-arr[i];
          if(map.containsKey(diff)){
              result.add(map.get(diff));
              result.add(i);
              return result;
          }
          map.put(arr[i],i);
      }

        return Collections.emptyList();
    }

    public static int findElementThatOccurExactlyOnce(int[]a){

        return Arrays.stream(a)
                .boxed()
                .collect(
                        Collectors.groupingBy(
                                Function.identity(),
                                Collectors.counting()
                        )
                ).entrySet()
                .stream()
                .filter(e->e.getValue()==1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(0);
    }
    public static int findElementThatOccurExactlyOnce2(int[]a){
        Map<Integer,Integer>map=new HashMap<>();
        for(int i:a){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        for(Map.Entry<Integer,Integer>m:map.entrySet()){
            if(m.getValue()==1){
                return m.getKey();
            }
        }
        return 0;
    }

    public static int firstElementAppearsMoreThanOnce(int[]a){
        Set<Integer>set=new HashSet<>();
        for(int i:a){
            if(!set.add(i)){
                return i;
            }
        }
        return 0;
    }

    public static List<Integer>twoSumWithoutedSortedarray(int[]a,int target){
        Map<Integer,Integer>map=new HashMap<>();

        for(int i=0;i<a.length;i++){
            int sum=target-a[i];
            if(map.containsKey(sum)){
                return List.of(map.get(sum),i);
            }
            map.put(a[i],i);
        }
        return Collections.emptyList();
    }

    public static int majorityElement(int[] arr) {
        // Your implementation
        Map<Integer,Integer>map=new HashMap<>();
        int n=arr.length/2;

        for(int i:arr){
            int value=map.getOrDefault(i,0)+1;
            map.put(i,value);
            if(value>n){
                return i;
            }
        }
        return 0;

    }

    public static List<Integer> majorityElementNBy3(int[] arr) {
        // Your logic
        Map<Integer,Integer>map=new HashMap<>();
        Set<Integer>set=new HashSet<>();
        int n=arr.length/3;

        for(int i:arr){
            int count=map.getOrDefault(i,0)+1;
            map.put(i,count);

            if(count>n){
                set.add(i);
            }
        }
        return new ArrayList<>(set);
    }


    public static boolean areArraysAnagrams(int[] a, int[] b) {

        if (a == null || b == null || a.length != b.length) {
            return false;
        }

        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();

        for (int i : a) {
            map1.put(i, map1.getOrDefault(i, 0) + 1);
        }

        for (int i : b) {
            map2.put(i, map2.getOrDefault(i, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> m : map1.entrySet()) {
            if (!map2.containsKey(m.getKey())
                    || !m.getValue().equals(map2.get(m.getKey()))) {
                return false;
            }
        }

        return true;
    }

    public static int firstRepeatingElement(int[] arr) {
        Set<Integer>set=new HashSet<>();

        for(int i:arr){
            if(!set.add(i)){
                return i;
            }
        }
        return 0;
    }

    public static Set<Integer> intersection(int[] a, int[] b) {
        Set<Integer>set1=new HashSet<>();
        Set<Integer>set2=new HashSet<>();
        for(int i:a){
            set1.add(i);
        }

        for(int i:b){
            if(!set1.add(i)){
                set2.add(i);
            }
        }
        return set2;
    }

}
