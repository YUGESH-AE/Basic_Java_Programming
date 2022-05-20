package javaSE8Features.StreamAPI.filter_sort2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Test2 {
    public static void main(String[] args) {
      List<Employee>emp=Employee.getall();
      Stream<Employee>emps=emp.stream();
              emps.filter((n)->n.getRole()=="ta")
              .forEach(System.out::println);
      Stream<Employee>count=emp.stream();
      long Count=count.filter((n)->n.getGender()=="F")
                      .count();


        System.out.println(Count);
    }
}

class Employee{

    public int id;
    public String name;
    private int sal;
    private double yearsInOrg;
    private String role;
    private String gender;

    public Employee(int id, String name, int sal, double yearsInOrg, String role, String gender) {
        this.id = id;
        this.name = name;
        this.sal = sal;
        this.yearsInOrg = yearsInOrg;
        this.role = role;
        this.gender = gender;
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

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public double getYearsInOrg() {
        return yearsInOrg;
    }

    public void setYearsInOrg(double yearsInOrg) {
        this.yearsInOrg = yearsInOrg;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sal=" + sal +
                ", yearsInOrg=" + yearsInOrg +
                ", role='" + role + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public static List<Employee> getall(){
        List<Employee>emp=new ArrayList<>();
        emp.add(new Employee(101,"ravi",1000,1,"ta","M"));
        emp.add(new Employee(102,"sandya",3000,2,"se","F"));
        emp.add(new Employee(103,"shalini",5000,1,"ta","F"));
        emp.add(new Employee(104,"akash",1000,10,"se","F"));
        emp.add(new Employee(105,"nadiya",2000,12,"se","F"));
        emp.add(new Employee(106,"kureshi",5000,1,"sse","M"));
        emp.add(new Employee(107,"sanjay",5000,4,"TA","M"));
        emp.add(new Employee(108,"mani",1000,5,"gm","M"));
        emp.add(new Employee(109,"rahul",1000,31,"Tl","M"));
        emp.add(new Employee(110,"don",3000,11,"Tl","M"));
        emp.add(new Employee(111,"remo",1000,7,"Tl","M"));
        emp.add(new Employee(112,"sayhesh",1000,11,"se","M"));
        emp.add(new Employee(113,"best",2000,7,"se","M"));
        emp.add(new Employee(114,"fang",2000,2,"se","M"));
        emp.add(new Employee(115,"shivaji",4000,3,"se","M"));
        emp.add(new Employee(116,"suresh",5000,2,"se","M"));
        return emp;




    }
}