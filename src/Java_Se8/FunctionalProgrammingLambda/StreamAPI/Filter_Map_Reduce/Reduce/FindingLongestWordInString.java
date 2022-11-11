package Java_Se8.FunctionalProgrammingLambda.StreamAPI.Filter_Map_Reduce.Reduce;

import java.util.Arrays;
import java.util.Optional;

public class FindingLongestWordInString {
    public static void main(String[] args) {
        String s = "i am a java developer";
        longest(s);
    }

    public static void longest(String s) {
        String[] strings = s.split(" ");

        Optional<String> l = (Optional<String>) Arrays.stream(strings).reduce((a, b) -> a.length() > b.length() ? a : b);
        System.out.println("Longest String::" + l.get());
    }
}
