package Problem_Solving.StreamApi;

import java.util.*;
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
    public static Optional<String> findDepartmentWithHighestSalaryDifference(
            List<Employee> employees){
       return employees
               .stream()
               .collect(
                       Collectors.groupingBy(
                               Employee::department,
                               Collectors.summarizingInt(Employee::salary)
                       )
               )
               .entrySet()
               .stream()
               .max(
                       Comparator.comparingInt(
                               entry->entry.getValue().getMax()-
                                       entry.getValue().getMin()
                       )
               )
               .map(Map.Entry::getKey);
    }

    public static List<Employee> findEmployeesEarningMoreThanHighestSalaryInHR(
            List<Employee> employees) {

        // Your solution
        OptionalInt highSal = employees.stream()
                .filter(e -> e.department().equalsIgnoreCase("HR"))
                .mapToInt(Employee::salary)
                .max();

        if (highSal.isEmpty()) {
            return List.of();
        }

        return employees.stream()
                .filter(e -> e.salary() > highSal.getAsInt())
                .toList();
    }

    public static List<String> findDepartmentsWithSecondHighestHighEarners(
            List<Employee> employees) {

        Map<String, Long> departmentCounts = employees.stream()
                .filter(e -> e.salary() > 70000)
                .collect(Collectors.groupingBy(
                        Employee::department,
                        Collectors.counting()
                ));

        long secondHighest = departmentCounts.values().stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(0L);

        return departmentCounts.entrySet().stream()
                .filter(entry -> entry.getValue() == secondHighest)
                .map(Map.Entry::getKey)
                .toList();
    }

    public static List<Employee> findEmployees(List<Employee> employees) {

        Map<String,Double>departmentAverage=
                employees.stream()
                        .collect(
                                Collectors.groupingBy(
                                        Employee::department,
                                        Collectors.averagingDouble(Employee::salary)
                                )
                        );
        Map<String,Double>aboveAverage=
                departmentAverage
                        .entrySet()
                        .stream()
                        .filter(m->m.getValue()>70000)
                        .collect(
                                Collectors.toMap(
                                        Map.Entry::getKey,
                                        Map.Entry::getValue
                                )
                        );

        return employees.stream()
                .filter(e -> aboveAverage.containsKey(e.department())
                        && e.salary() > aboveAverage.get(e.department()))
                .toList();
    }


}
