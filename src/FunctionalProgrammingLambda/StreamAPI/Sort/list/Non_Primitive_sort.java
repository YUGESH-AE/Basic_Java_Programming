package FunctionalProgrammingLambda.StreamAPI.Sort.list;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Non_Primitive_sort {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(103, "Aakash", 450, 1));
        list.add(new Employee(101, "Sanjay", 500, 3));
        list.add(new Employee(104, "Ravi", 300, 2));
        list.add(new Employee(102, "Yugesh", 600, 7));

        list.stream()
                .sorted(Comparator.comparing(Employee::getName))
                .forEach(System.out::println);
    }
}

class Employee {
    private int id;
    private String name;
    private int salary;
    private int jobLevel;

    public Employee(int id, String name, int salary, int jobLevel) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.jobLevel = jobLevel;
    }

    public Employee() {
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getJobLevel() {
        return jobLevel;
    }

    public void setJobLevel(int jobLevel) {
        this.jobLevel = jobLevel;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", jobLevel=" + jobLevel +
                '}';
    }
}
