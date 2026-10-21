package Java_SE8Features.StreamAPI.collectors.downStreamCollectors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Mapping {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee(1, "Arun", "IT", 50000),
                new Employee(2, "Priya", "HR", 40000),
                new Employee(3, "Kumar", "IT", 60000),
                new Employee(4, "Divya", "HR", 45000)
        );

        Map<String,List<String>>departmentEmpNameMap=
                employees.stream()
                        .collect(
                                Collectors.groupingBy(
                                        Employee::department,
                                        Collectors.mapping(
                                                Employee::name,
                                                Collectors.toList()
                                        )
                                )
                        );
        System.out.println(departmentEmpNameMap);
    }
}
