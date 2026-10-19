package Java_SE8Features.StreamAPI.collectors.toMap;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee(101, "Arun", 40000),
                new Employee(102, "Bala", 60000),
                new Employee(103, "Charan", 75000)
        );

        Map<Integer, String> employeeMap = employees.stream()
                .collect(Collectors.toMap(
                        Employee::id,
                        Employee::name
                ));

        System.out.println(employeeMap);
        System.out.println(employeeMap.get(102));
    }
}

record Employee(int id,String name,int salary){

}
