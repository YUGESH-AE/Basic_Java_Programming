package javaSE8Features.LambdaExpression.PredicateFunctional2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


public class Main{
    public static void main(String[] args) {
        List<Employee>emp=Employee.getall();

        System.out.println("Printing Even Employee Ids");
        evaluvate(emp,(n)->n.getEmpId()%2==0);

        System.out.println("Printing Odd Employee Ids");
        evaluvate(emp,(n)->n.getEmpId()%2!=0);

        System.out.println("Printing Employee Ids less than 1500");
        evaluvate(emp,(n)->n.getEmpId()<1500);

    }
    public static void evaluvate(List<Employee> e, Predicate<Employee> p){
        for (Employee i:e){
            if(p.test(i)){
                System.out.println(i.getEmpId());
            }
        }
    }
}
class Employee {

    private Integer empId;
    private String empName;
    private String country;

    public Employee(Integer empId, String empName, String country) {
        this.empId = empId;
        this.empName = empName;
        this.country = country;
    }

    public Employee() {
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    public static List<Employee>getall(){
        //Creating 5 instances of Employee
        Employee e1 = new Employee(1001,"Aron","Spain");
        Employee e2 = new Employee(1050,"Cindia","Portugal");
        Employee e3 = new Employee(1602,"Zidane","France");
        Employee e4 = new Employee(1453,"Robert","Belgium");
        Employee e5 = new Employee(1500,"Francis","USA");

        List<Employee>employees=new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);
        return employees;
    }
}
