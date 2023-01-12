package FunctionalProgrammingLambda.StreamAPI.Filter_Map_Reduce.Map_Filter_Reduce;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> list = Employee.getEmployee();

        //get employee whose grade is A
        //to fetch salary
        //to convert it to double
        Double salary = list.stream()
                .filter(employee -> employee.getGrade().equalsIgnoreCase("A"))
                .map(employee -> employee.getSalary())
                .mapToDouble(i -> i)
                .average().getAsDouble();
        System.out.println("Empoyee whose grade A avg salary::" + salary);
        System.out.println("***********************************************");
        Double sumSalary = list.stream()
                .filter(employee -> employee.getGrade().equalsIgnoreCase("A"))
                .map(employee -> employee.getSalary())
                .mapToDouble(i -> i)
                .sum();
        System.out.println("Empoyee whose grade A total salary::" + sumSalary);

    }
}
