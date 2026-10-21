package Java_SE8Features.StreamAPI.collectors.downStreamCollectors;


import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Reduce {
    public static void main(String[] args) {

        List<Integer> list=List.of(1,2,3,4,5,7,9,10);

        //overload 1
       Optional<Integer>sum =list.stream()
                .collect(Collectors.reducing(Integer::sum));
        System.out.println(sum);

        //overload 2
        List<Integer> numbers = List.of(10, 20, 30, 40);

        Integer result = numbers.stream()
                .collect(Collectors.reducing(
                        0,
                        (a, b) -> a + b
                ));

        System.out.println(result);

        //overload 3

        List<Employee> employees = List.of(
                new Employee(101,"Arun", "IT", 50000),
                new Employee(102,"Bala", "IT", 60000),
                new Employee(103,"Charan", "HR", 40000)
        );

        int total=employees
                .stream()
                .collect(
                        Collectors.reducing(
                                0,
                                Employee::salary,
                                Integer::sum
                        )
                );
        System.out.println(total);

        Map<String,Integer>departmap=
                employees.stream()
                        .collect(
                                Collectors.groupingBy(
                                        Employee::department,
                                       Collectors.reducing(
                                               0,
                                               Employee::salary,
                                               Integer::sum
                                       )
                                )
                        );

        System.out.println(departmap);

    }
}
