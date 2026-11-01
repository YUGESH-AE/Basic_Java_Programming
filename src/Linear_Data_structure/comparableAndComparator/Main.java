package Linear_Data_structure.comparableAndComparator;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Employee>list=new ArrayList<>();
        list.add(new Employee(1,"John",25,5000));
        list.add(new Employee(2,"Jane",30,6000));
        list.add(new Employee(3,"Jack",28,5500));
        list.add(new Employee(4,"Jill",27,5200));
        list.add(new Employee(5,"Junk",27,5200));

        Collections.sort(list);
        list.sort(Comparator.comparing(Employee::getName).thenComparing(Employee::getAge).thenComparing(Employee::getSalary));
        System.out.println(list);

    }
}
