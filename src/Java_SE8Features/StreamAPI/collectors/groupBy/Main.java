package Java_SE8Features.StreamAPI.collectors.groupBy;


import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Employee> list=List.of(
            new Employee(1,"John","IT",50000),
            new Employee(2,"Jane","HR",60000),
            new Employee(3,"Bob","IT",55000),
            new Employee(4,"Alice","HR",70000),
            new Employee(5,"Tom","IT",65000)
        );

        Map<String,List<Employee>>mapDep=
                list.stream()
                        .collect(
                                Collectors.groupingBy(Employee::department)
                        );

        System.out.println(mapDep);

        //overload 2
        Map<String,List<String>>mapNames=
                list.stream()
                        .collect(
                                Collectors.groupingBy(
                                        Employee::department,
                                        Collectors.mapping(Employee::name,Collectors.toList())
                                )
                        );

        System.out.println(mapNames);

        Map<String,Integer>mapSalaries=
                list.stream()
                        .collect(
                                Collectors.groupingBy(
                                        Employee::department,
                                        Collectors.summingInt(Employee::salary)
                                )
                        );

        System.out.println(mapSalaries);

        Map<String,Long>mapCount=
                list.stream()
                        .collect(
                                Collectors.groupingBy(
                                        Employee::department,
                                        Collectors.counting()
                                )
                        );

        System.out.println(mapCount);

        //Overloaded 3

        Map<String,List<Employee>>mapEmp=
                list.stream()
                        .collect(
                                Collectors.groupingBy(
                                        Employee::department,
                                       TreeMap::new,
                                        Collectors.toList()
                                )
                        );

        System.out.println(mapEmp);
    }



}

record Employee(int id,String name,String department,int salary){

}
