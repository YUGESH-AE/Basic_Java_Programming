package Java_SE8Features.StreamAPI.collectors.downStreamCollectors;


import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Summarizing {
    public static void main(String[] args) {

        List<Integer> marks = List.of(70, 80, 90, 100);

        IntSummaryStatistics stats = marks.stream()
                .collect(Collectors.summarizingInt(Integer::intValue));

        System.out.println("Count: " + stats.getCount());
        System.out.println("Sum: " + stats.getSum());
        System.out.println("Min: " + stats.getMin());
        System.out.println("Max: " + stats.getMax());
        System.out.println("Average: " + stats.getAverage());
    }
}
