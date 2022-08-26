package Java_Language_Features.Generics_Wildcards.CollectionFrameWork.List.ArrayList;

import java.util.*;

public class ArrayListss {
    public static void main(String[] args) {
//        ArrayList<String>list1=new ArrayList<>();
//        list1.add("ball");
//        list1.add("apple");
//        list1.add("cat");
//
//        Collections.sort(list1);
//        Iterator<String>i1=list1.iterator();
//        while(i1.hasNext()){
//            System.out.println(i1.next());
//        }
        ArrayList<Student> s1 = new ArrayList<>();
        s1.add(new Student(101, "ravi"));
        s1.add(new Student(100, "Yugesh"));
        s1.add(new Student(99, "Ramesh"));
        //Arraylist will accept null values and duplicate values
        s1.add(null);

        for (Student i : s1
        ) {
            System.out.println(i);
        }

    }
}

class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}