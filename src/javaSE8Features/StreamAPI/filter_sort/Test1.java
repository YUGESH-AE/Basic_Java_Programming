package javaSE8Features.StreamAPI.filter_sort;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Test1 {
    public static void main(String[] args) {
        List<Employee> employees=Employee.getEmployeeList();
        Stream<Employee> employeeStream=employees.stream();
        employeeStream.filter((e)->e.getYearsInOrg()<1)
                .sorted((e1,e2)->e1.getId()-e2.getId())
                .forEach(System.out::println);
    }
}

class Employee
{
    private Integer id;
    private String name;
    private Integer yearsInOrg;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getYearsInOrg() {
        return yearsInOrg;
    }
    public void setYearsInOrg(Integer yearsInOrg) {
        this.yearsInOrg = yearsInOrg;
    }
    public Employee(Integer id, String name, Integer yearsInOrg) {
        super();
        this.id = id;
        this.name=name;
        this.yearsInOrg = yearsInOrg;
    }
    @Override
    public String toString() {
        return "Employee [id=" + id + ", yearsInOrg=" + yearsInOrg + ", name=" + name + "]";
    }
    public static List<Employee> getEmployeeList()
    {
        Employee e1 = new Employee(101,"Roger",0);
        Employee e2 = new Employee(104,"Chris",2);
        Employee e3 = new Employee(103,"Samuel",0);
        Employee e4 = new Employee(102,"Brian",3);
        List<Employee> empList = new ArrayList<>();
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);
        return empList;
    }
}