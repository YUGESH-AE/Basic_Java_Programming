package Java_Language_Features.Generics_Wildcards.CollectionFrameWork.List.LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListLinked {
    public static void main(String[] args) {
//        LinkedList<String>list=new LinkedList<>();
//        list.add("Apple");
//        list.add("Ball");
//        list.addFirst("Chocolate");
//        list.addLast("MObile");
//        ListIterator<String>iterator= list.listIterator();
//        while(iterator.hasPrevious()) {
//            System.out.println(iterator.previous());
//        }

        LinkedList<Student> students = new LinkedList<>();
        students.addLast(new Student(101, "Ravi"));
        students.addLast(new Student(103, "Raju"));
        students.addFirst(new Student(100, "Sanjay"));
        students.add(new Student(190, "Kumar"));
        //null and duplicate values are allowed
        students.add(null);

        for (Student i : students
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