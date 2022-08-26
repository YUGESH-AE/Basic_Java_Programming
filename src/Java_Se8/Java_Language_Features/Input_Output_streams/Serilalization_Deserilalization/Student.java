package Java_Se8.Java_Language_Features.Input_Output_streams.Serilalization_Deserilalization;

import java.io.Serializable;
import java.util.Set;

public class Student  implements Serializable {

    private static final long serialVersionUID = 1L;
    private int id;
    private String name;
    private Set<Course> cname;
    private int age;

    public Student(int id, String name, Set<Course> cname, int age) {
        this.id = id;
        this.name = name;
        this.cname = cname;
        this.age = age;
    }

    public Student() {
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

    public Set<Course> getCname() {
        return cname;
    }

    public void setCname(Set<Course> cname) {
        this.cname = cname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cname=" + cname +
                ", age=" + age +
                '}';
    }
}
