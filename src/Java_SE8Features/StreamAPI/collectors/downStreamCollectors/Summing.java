package Java_SE8Features.StreamAPI.collectors.downStreamCollectors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Summing {

    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee(1, "Arun", "IT", 50000),
                new Employee(2, "Priya", "HR", 40000),
                new Employee(3, "Kumar", "IT", 60000)
        );

        Map<String,Integer>summingDepartmentSalary=
                employees.stream()
                        .collect(
                                Collectors.groupingBy(
                                        Employee::department,
                                        Collectors.summingInt(Employee::salary)
                                )
                        );

        System.out.println(summingDepartmentSalary);

       long totalSalary=employees.stream()
               .collect(Collectors.summingInt(Employee::salary));

        System.out.println(totalSalary);

    }
}