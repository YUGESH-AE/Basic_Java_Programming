package Java_SE8Features.StreamAPI.collectors.downStreamCollectors;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class MinAndMaxBy {
    public static void main(String[] args) {


        List<Employee> employees = List.of(
                new Employee(1, "Arun", "IT", 50000),
                new Employee(2, "Priya", "HR", 40000),
                new Employee(3, "Kumar", "IT", 60000)
        );
        Optional<Employee>minSalariedEmployee=
                employees.stream()
                        .collect(
                                Collectors.minBy(
                                        Comparator.comparing(Employee::salary)
                                )
                        );

        System.out.println("Min Salaried Employee"+minSalariedEmployee.get());

        Optional<Employee>maxSalariedEmployee=
                employees.stream()
                        .collect(
                                Collectors.maxBy(
                                        Comparator.comparing(Employee::salary)
                                )
                        );

        System.out.println("Max Salaried Employee"+maxSalariedEmployee.get());

        List<Integer> numbers = List.of(40, 10, 70, 20, 50);

        Optional<Integer> minimum = numbers.stream()
                .collect(Collectors.minBy(Integer::compareTo));

        Optional<Integer> maximum = numbers.stream()
                .collect(Collectors.maxBy(Integer::compareTo));

        System.out.println(minimum.orElseThrow());
        System.out.println(maximum.orElseThrow());

        Map<String,Optional<Employee>>lowestPaidEmployeeInEachDepartment=
                employees
                        .stream()
                        .collect(

                                Collectors.groupingBy(
                                        Employee::department,
                                        Collectors.minBy(
                                                Comparator.comparing(Employee::salary)
                                        )
                                )
                        );

        System.out.println(lowestPaidEmployeeInEachDepartment);
    }




}
