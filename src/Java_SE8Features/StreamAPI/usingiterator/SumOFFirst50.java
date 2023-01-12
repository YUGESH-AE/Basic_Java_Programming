package Java_SE8Features.StreamAPI.usingiterator;

import java.util.stream.Stream;

public class SumOFFirst50 {

    public static void main(String[] args) {
        Integer sum= Stream.iterate(1,n->n+1)
                .limit(50)
                .reduce(Integer::sum)
                .get();
        System.out.println(sum);
    }
}
