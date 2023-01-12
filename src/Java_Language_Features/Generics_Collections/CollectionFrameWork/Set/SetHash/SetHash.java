package Java_Language_Features.Generics_Collections.CollectionFrameWork.Set.SetHash;

import java.util.HashSet;
import java.util.Objects;

public class SetHash {
    public static void main(String[] args) {
//        HashSet<String>set=new HashSet<>();
//        set.add("ravi");
//        set.add("ravi");
//        set.add("Sanjay");
//        set.add(null);
//        for (String i:set
//             ) {
//            System.out.println(i);
//        }
        //if i override hashcode and equals only unique value will be allowed
        HashSet<Student> students = new HashSet<>();
        students.add(new Student(101, "sanjay"));
        students.add(new Student(101, "sanjay"));
        students.add(new Student(105, "Ramkuamr"));
        students.add(new Student(104, "sahil"));
        //null values are allowed
        students.add(null);
        // elemets will be inserted in ramdom order
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}