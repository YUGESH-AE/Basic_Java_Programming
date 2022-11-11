package Java_Se8.FunctionalProgrammingLambda.StreamAPI.Sort.Map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Sort_Map_Stream_Nonprimitive {
    public static void main(String[] args) {
        Map<Employees, Integer> map = new HashMap<>();
        map.put(new Employees(103, "Aakash", 450, 1), 600);
        map.put(new Employees(101, "Sanjay", 500, 3), 200);
        map.put(new Employees(104, "Ravi", 300, 2), 100);
        map.put(new Employees(102, "Yugesh", 600, 7), 500);

        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey(Comparator.comparing(Employees::getName)))
                .forEach(System.out::println);
        System.out.println("***********************************************************");

        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);

    }
}

class Employees {
    private int id;
    private String name;
    private int salary;
    private int jobLevel;

    public Employees(int id, String name, int salary, int jobLevel) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.jobLevel = jobLevel;
    }

    public Employees() {
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

