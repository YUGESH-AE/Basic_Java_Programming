package FunctionalProgrammingLambda.StreamAPI.Filter_Map_Reduce.Map_Filter_Reduce;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Employee {
    private int id;
    private String name;
    private String grade;
    private double salary;

    public Employee(int id, String name, String grade, double salary) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.salary = salary;
    }

    public static List<Employee> getEmployee() {
        return Stream.of(
                new Employee(103, "Ravi", "A", 50000),
                new Employee(100, "Sursh", "A", 25000),
                new Employee(105, "Ravi", "B", 100000),
                new Employee(106, "Yugesh", "B", 450000),
                new Employee(102, "Suresh", "A", 30000)
        ).collect(Collectors.toList());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                ", salary=" + salary +
                '}';
    }
}
