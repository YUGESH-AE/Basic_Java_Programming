package Problem_Solving.StreamApi;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ObjectBased {
    
    public static void main(String[] args) {

    }

    public static Map<String,Employee> findHighestPaidEmployeeByDepartment(List<Employee> employees){

        return employees
                .stream()
                .collect(
                        Collectors.groupingBy(
                                Employee::department,
                              Collectors.collectingAndThen(
                                      Collectors.maxBy(Comparator.comparingInt(Employee::salary)),
                                      Optional::get
                              )
                        )
                );
    }
    public static Map<String,Double> findAverageSalaryByDepartment(List<Employee> employees){

        return employees.stream()
                .collect(
                        Collectors.groupingBy(
                                Employee::department,
                                Collectors.averagingDouble(Employee::salary)
                        )
                );
    }
    public static Map<String,Integer> findTotalSalaryByDepartment(List<Employee> employees){
        return employees.stream()
                .collect(
                        Collectors.groupingBy(
                                Employee::department,
                                Collectors.summingInt(Employee::salary)
                        )
                );
    }
    public static Map<String,Long> findDepartmentWithMoreThanTwoEmployees(List<Employee> employees){
        return employees
                .stream()
                .collect(
                        Collectors.groupingBy(
                                Employee::department,
                                Collectors.counting()
                        )
                )
                .entrySet()
                .stream()
                .filter(v->v.getValue()>2)
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
    }
    public static Map<String,Integer> findHighestSalaryInEachDepartment(List<Employee> employees){
        return employees.stream()
                .collect(
                        Collectors.groupingBy(
                                Employee::department,
                               Collectors.collectingAndThen(
                                       Collectors.maxBy(Comparator.comparing(Employee::salary)),
                                       o->o.get().salary()
                               )
                        )
                );
    }
    public static Optional<String> findTheDepartmentWithHighestAverageSalary(List<Employee> employees){
        return employees.stream()
                .collect(
                        Collectors.groupingBy(
                                Employee::department,
                                Collectors.averagingDouble(Employee::salary)
                        )
                ).entrySet()
                .stream()
                .max(Comparator.comparingDouble(Map.Entry::getValue))
                .map(Map.Entry::getKey);
    }

    public static List<Employee> findTheTop3HighestPaidEmployees(List<Employee> employees){
        return employees
                .stream()
                .sorted(Comparator.comparing(Employee::salary).reversed())
                .limit(3)
                .toList();
    }
    public static Optional<Integer> findSecondHighestSalary(List<Employee> employees){
        return employees
                .stream()
                .map(Employee::salary)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();

    }
    public static Optional<String> findTheDepartmentWithHighestTotalSalary(List<Employee> employees){
        return employees
                .stream()
                .collect(
                        Collectors.groupingBy(
                                Employee::department,
                                Collectors.summingInt(Employee::salary)
                        )
                ).entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);
    }

    public static Map<String,List<Employee>> findEmployeesWithSalaryGreaterThanAverageByDepartment(List<Employee> employees) {

        Map<String, Double> mapAverage =
                employees
                        .stream()
                        .collect(
                                Collectors.groupingBy(
                                        Employee::department,
                                        Collectors.averagingDouble(Employee::salary)
                                )
                        );


        return employees.stream()
                .collect(
                        Collectors.groupingBy(
                                Employee::department,
                                Collectors.filtering(
                                        e -> e.salary() > mapAverage.get(e.department()),
                                        Collectors.toList()
                                )
                        )
                );
    }

    public static Map<String,Employee> findTheHighestPaidEmployeeInEachDepartment(List<Employee> employees){
        return employees
                .stream()
                .collect(
                  Collectors.groupingBy(
                          Employee::department,
                          Collectors.collectingAndThen(
                                  Collectors.maxBy(Comparator.comparing(Employee::salary)),
                                  Optional::get
                          )
                  )
                );
    }
    public static Optional<String> findTheDepartmentWithLowestAverageSalary(List<Employee> employees){


            return  employees.stream()
                        .collect(
                                Collectors.groupingBy(
                                        Employee::department,
                                        Collectors.averagingDouble(Employee::salary)
                                )
                        ).entrySet()
                    .stream()
                    .min(Map.Entry.comparingByValue())
                    .map(Map.Entry::getKey);


    }

    public static Optional<String> findDepartmentWithMostHighEarners(
            List<Employee> employees){
        return
                employees
                        .stream()
                        .filter(e->e.salary()>50000)
                        .collect(
                                Collectors.groupingBy(
                                        Employee::department,
                                        Collectors.counting()
                                )
                        ).entrySet()
                        .stream()
                        .max(Map.Entry.comparingByValue())
                        .map(Map.Entry::getKey);
    }


}
