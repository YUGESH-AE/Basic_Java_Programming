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
}
