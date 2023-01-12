package FunctionalProgrammingLambda.StreamAPI.Skip_Limit_Methods;

import java.util.Arrays;
import java.util.List;

public class SkipLimitTutorials {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        list.stream()
                .skip(1)
                .limit(7)
                .forEach(System.out::print);
    }
}
