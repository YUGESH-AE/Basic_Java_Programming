package Problem_Solving.Array.W3.Integer;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/**
 * Remove Duplicates Element
 */
public class RemovingDuplicatesFromArray {

    public static void main(String[] args) {

        Set<Integer> set = fimdingDuplicates(Stream.of(1, 2, 5, 5, 6, 6, 7, 2));
        System.out.println(set);

    }

    public static Set<Integer> fimdingDuplicates(Stream<Integer> stream) {

        Set<Integer> set = new HashSet<>();

        return stream
                .filter(i -> set.add(i))
                .collect(Collectors.toSet());
    }
}
