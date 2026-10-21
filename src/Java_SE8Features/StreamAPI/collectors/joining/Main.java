package Java_SE8Features.StreamAPI.collectors.joining;


import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<String> list=List.of("yugesh","is","a","developer");

        //Overload 1
        String value=list
                .stream()
                .collect(Collectors.joining());
        System.out.println(value);

        //overload 2
        String value2=list
                .stream()
                .collect(Collectors.joining(" "));
        System.out.println(value2);

        //overload 3
        String value3=list
                .stream()
                .collect(Collectors.joining(" ,","[","]"));
        System.out.println(value3);
    }
}
