package Java_SE8Features.StreamAPI.collectors.downStreamCollectors;


import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Counting {
    public static void main(String[] args) {

        List<String> names=List.of("John","Jane","Jack","Jill");

        long count=
                names.stream()
                        .collect(Collectors.counting());

        System.out.println(count);

        List<Employee>list=List.of(new Employee(1,"John","Developer",50000),
                new Employee(2,"Jane","Manager",70000),
                new Employee(3,"Jack","Developer",55000),
                new Employee(4,"Jill","Manager",75000));

        Map<String,Long>departmentCountMap=
                list.stream()
                        .collect(
                                Collectors.groupingBy(
                                        Employee::department,
                                        Collectors.counting()
                                )
                        );

        System.out.println(departmentCountMap);

        Map<Boolean, Long> salaryCount =
                list.stream()
                        .collect(Collectors.partitioningBy(
                                employee -> employee.salary() >= 50000,
                                Collectors.counting()
                        ));

        System.out.println(salaryCount);
    }
}
