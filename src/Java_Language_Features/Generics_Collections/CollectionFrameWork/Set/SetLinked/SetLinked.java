package Java_Language_Features.Generics_Collections.CollectionFrameWork.Set.SetLinked;

import java.util.LinkedHashSet;

public class SetLinked {
    public static void main(String[] args) {

        LinkedHashSet<Student> students = new LinkedHashSet<>();
        students.add(new Student(101, "sanjay"));
        students.add(new Student(101, "sanjay"));
        students.add(new Student(105, "Ramkuamr"));
        students.add(new Student(104, "sahil"));
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

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Student student = (Student) o;
//        return id == student.id && Objects.equals(name, student.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, name);
//    }
}