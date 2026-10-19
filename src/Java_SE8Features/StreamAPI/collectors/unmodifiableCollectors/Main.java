package Java_SE8Features.StreamAPI.collectors.unmodifiableCollectors;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<String> names = Stream.of("Arun", "Bala", "Charan")
                .collect(Collectors.toUnmodifiableList());

        System.out.println(names);

        Set<String> departments = Stream.of(
                "IT",
                "HR",
                "IT",
                "FINANCE"
        ).collect(Collectors.toUnmodifiableSet());

        System.out.println(departments);

        List<Employee> employees = List.of(
                new Employee(101, "Arun", 40000),
                new Employee(102, "Bala", 60000),
                new Employee(103, "Charan", 75000)
        );

        Map<Integer, String> result = employees.stream()
                .collect(Collectors.toUnmodifiableMap(
                        Employee::id,
                        Employee::name
                ));

        System.out.println(result);

        List<String> namesList = List.of("Arun", "Bala", "Charan");

        Map<Integer, String> resultMap = names.stream()
                .collect(Collectors.toUnmodifiableMap(
                        String::length,
                        Function.identity(),
                        (existing, replacement) -> existing
                ));

        System.out.println(resultMap);
    }
}
record Employee(int id, String name,int salary) {
}