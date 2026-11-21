package Problem_Solving.StreamApi;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


public class StringFundamentals {
    public static void main(String[] args) {


        System.out.println(findTheSecondLongestWordInTheList(List.of("Java","SpringBoot","Stream","Programming")));

    }

    public static Optional<String> findTheFirstNonRepeatingCharacters(String str) {

        return Arrays.stream(str.split(""))
                .collect(
                        Collectors.groupingBy(
                                Function.identity(),
                                LinkedHashMap::new,
                                Collectors.counting()
                        )
                ).entrySet()
                .stream()
                .filter(i -> i.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst();
    }

    public static Optional<String> firstRepeatingCharacter(String str) {

        return Arrays.stream(str.split(""))
                .collect(
                        Collectors.groupingBy(
                                Function.identity(),
                                LinkedHashMap::new,
                                Collectors.counting()
                        )
                ).entrySet()
                .stream()
                .filter(i -> i.getValue() > 1)
                .map(Map.Entry::getKey)
                .findFirst();
    }

    public static Optional<String> firstRepeatedOccurrence(String str) {

        Set<Integer> set = new HashSet<>();

        return str.chars()
                .filter(i -> !set.add(i))
                .mapToObj(i -> String.valueOf((char) i))
                .findFirst();
    }


    public static long countVowelsInString(String str) {
        List<String> list = List.of("a", "e", "i", "o", "u");

        return Arrays.stream(str.split(""))
                .filter(s -> list.contains(s))
                .count();
    }

    public  static Map<String,Long> countEachVowelsInString(String str) {
        List<String> list = List.of("a", "e", "i", "o", "u");

        return Arrays.stream(str.split(""))
                .filter(s->list.contains(s))
                .collect(
                        Collectors.groupingBy(
                                Function.identity(),
                                LinkedHashMap::new,
                                Collectors.counting()
                        )
                );
    }

    public static Optional<String> findTheLongestWord(List<String>words){

        return words
                .stream()
                .max(Comparator.comparingInt(String::length));
    }
    public static  Optional<String> findSecondLongestWord(List<String>words){

        return words
                .stream()
                .distinct()
                .sorted(Comparator.comparingInt(String::length).reversed())
                .skip(1)
                .findFirst();

    }

    public static List<String> findWordThatStartsWith(List<String>words,String prefix) {

        return words
                .stream()
                .filter(word->word.startsWith(prefix))
                .toList();
    }
    public static List<String> findWordThatContainsParticularSubString(List<String>words,String substring) {

        return words
                .stream()
                .filter(word->word.contains(substring))
                .toList();
    }
    public static List<String> convertEveryWordToUpperCase(List<String> words) {

        return words
                .stream()
                .map(String::toUpperCase)
                .toList();
    }
    public static List<Integer> findTheLengthOfEveryWord(List<String>words) {
        return words
                .stream()
                .map(String::length)
                .toList();
    }

    public static int findTheTotalLengthOfAllWords(List<String>words) {
        return words
                .stream()
                .mapToInt(String::length)
                .sum();
    }

    public static List<String> findWordsLongerThanTheAverageWord(List<String>words) {

       double average=words
               .stream()
               .mapToDouble(String::length)
               .average()
               .orElse(0.0);

       return words.stream()
               .filter(w->w.length()>average)
               .toList();


    }

    public static String findTheShortestWordInTheList(List<String> words) {
        return words
                .stream()
                .min(Comparator.comparing(String::length))
                .orElse(null);
    }

    public static String findTheLongestWordInTheList(List<String> words) {
        return words
                .stream()
                .max(Comparator.comparing(String::length))
                .orElse(null);
    }

    public static String findTheSecondLongestWordInTheList(List<String> words) {
        return words
                .stream()
                .sorted(Comparator.comparing(String::length).reversed())
                .skip(1)
                .findFirst()
                .orElse(null);
    }
    public static List<String> findWordsThatHaveLengthGreater(List<String>words) {
        return words
                .stream()
                .filter(w->w.length()>5)
                .toList();
    }

    public static long findWordsCountLongerThan(List<String>words) {
        return words
                .stream()
                .filter(w->w.length()>5)
                .mapToLong(String::length)
                .count();
    }

    public static Map<Character, Long> countVowels(String input) {

        return Arrays.stream(input.split(""))
                .map(v->v.charAt(0))
                .filter(StringFundamentals::isVowel)
                .collect(
                        Collectors.groupingBy(
                                Function.identity(),
                                Collectors.counting()
                        )
                );
    }

    public static boolean isVowel(char c){
        return "aeiouAEIOU".indexOf(c)!=-1;
    }

    public static Map<Character, Long> countAllVowels(String input) {

        Map<Character,Long>vowelMap=new HashMap<>();
        vowelMap.put('a',0L);
        vowelMap.put('e',0L);
        vowelMap.put('i',0L);
        vowelMap.put('o',0L);
        vowelMap.put('u',0L);
        vowelMap.put('A',0L);
        vowelMap.put('E',0L);
        vowelMap.put('I',0L);
        vowelMap.put('O',0L);
        vowelMap.put('U',0L);

        Arrays.stream(input.split(""))
                .map(c->c.charAt(0))
                .filter(StringFundamentals::isVowel)
                .forEach(v->vowelMap.merge(v,1L,Long::sum));

        return vowelMap;

    }

    public static Optional<Map.Entry<Character, Long>> findMostFrequentCharacter(String input){

       return input.chars()
               .mapToObj(c->Character.toLowerCase((char)c))
               .filter(c->!Character.isWhitespace(c))
               .collect(
                       Collectors.groupingBy(
                               Function.identity(),
                               LinkedHashMap::new,
                               Collectors.counting()
                       )
               ).entrySet()
               .stream()
               .max(Comparator.comparing(Map.Entry::getKey));
    }

    public static String removeDuplicateCharacters(String input){


       return Arrays.stream(input.split(""))
                .distinct()
               .collect(Collectors.joining());


    }
}
