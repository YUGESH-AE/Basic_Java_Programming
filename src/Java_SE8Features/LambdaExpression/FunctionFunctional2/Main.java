package Java_SE8Features.LambdaExpression.FunctionFunctional2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees=Employee.getEmpList();
        for (Employee i:employees){
            double sal=compute(i,i1->i1.getSal() *1.1);
            System.out.println("Old salary:"+i.getSal()+" "+"new Salary:"+sal);
        }

    }
    public static double compute(Employee e, Function<Employee,Double> f){
        return f.apply(e);

    }
}

class Employee
{
    private Integer empId;
    private String name;
    private Double sal;

    public Employee(Integer empId, String name, Double sal) {
        super();
        this.empId = empId;
        this.name = name;
        this.sal = sal;
    }

    public Double getSal() {
        return sal;
    }
    public void setSal(Double sal) {
        this.sal = sal;
    }
    public Integer getEmpId() {
        return empId;
    }
    public void setEmpId(Integer empId) {
        this.empId = empId;
    }
    public String getName() {
        return name;
    }
    public void setName(String empName) {
        this.name = name;
    }

    public static List<Employee> getEmpList()
    {
        Employee e1 = new Employee(101,"Aron",50000D);
        Employee e2 = new Employee(102,"Cindia",30000D);
        Employee e3 = new Employee(103,"Zidane",45000D);
        List<Employee> empList = new ArrayList<>();
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        return empList;
    }

}
